package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.*;
import com.woniu.housemanager.service.*;
import com.woniu.housemanager.tools.GenerateCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ClassName:ApplicantController
 * Package:controller
 * Description:
 *
 * @Date:2020/6/9 20:25
 * @Author:wang
 */
@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Resource
    private ApplicantService applicantService;
    @Resource
    private HouseInfoService houseInfoService;
    @Resource
    private QiuDiHaoService qiuDiHaoService;
    @Resource
    private CommoninfoService commoninfoService;
    @Resource
    private BusinessService businessService;
    @Resource
    private HousePeopleService housePeopleService;
    @Resource
    private CheckeService checkeService;


    @PostMapping("/save")
    @ResponseBody
    public String save(String[] aname, String[] acard, String[] aphone, String[] aaddress,
        QiuDiHao qiuDiHao, HouseInfo houseInfo, String[] commonway, String[] commonshare, @RequestParam("files") MultipartFile[] files) {
        //根据共有人数量添加到数据库
        List<Integer> aid = new ArrayList<>();
       List<String> fileNames = new ArrayList<>(files.length);

        for (int i = 0; i < aname.length; i++) {
            Applicant applicant = new Applicant();
            applicant.setAname(aname[i]);
            applicant.setAcard(acard[i]);
            applicant.setAphone(aphone[i]);
            applicant.setAadress(aaddress[i]);
            applicantService.insert(applicant);
            aid.add(applicant.getAid());
        }
        //增加丘地号
        qiuDiHaoService.insert(qiuDiHao);
        //增加共有人信息
        for (int i = 0; i < aid.size(); i++) {
            Commoninfo commoninfo = new Commoninfo();
            commoninfo.setAid(aid.get(i));
            commoninfo.setCommonway(commonway[i]);
            commoninfo.setCommonshare(commonshare[i]);
            commoninfoService.save(commoninfo);
        }

        //增加房屋编号
        HouseNumber houseNumber = new HouseNumber();
        houseNumber.setHncode(GenerateCode.getHouseCode());
        houseInfoService.saveHouseNum(houseNumber);
        int hnid = houseNumber.getHnid();

        //增加房屋信息
        houseInfo.setQiuid(qiuDiHao.getQiuid());
        houseInfo.setHnid(hnid);
        houseInfoService.save(houseInfo);
        int hiid = houseInfo.getHiid();

        //插入housePeople
        for (int i = 0; i < aid.size(); i++) {
            HousePeopleKey housePeopleKey = new HousePeopleKey();
            housePeopleKey.setAid(aid.get(i));
            housePeopleKey.setHnid(hnid);
            housePeopleService.save(housePeopleKey);
        }

        //增加业务状态表
        String status = "已受理";
        Bussnessstatus bussnessstatus = new Bussnessstatus();
        bussnessstatus.setBsstatus(status);
        bussnessstatus.setAname(aname[0]);
        bussnessstatus.setAcard(acard[0]);
        bussnessstatus.setBsdate(new Date());
        bussnessstatus.setHiid(houseInfo.getHiid());
        //使用编码生成器自动生成业务号
        bussnessstatus.setBsid(GenerateCode.getBsCode());
        businessService.save(bussnessstatus);


        //上传文件
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                return "文件不存在";
            }
            String fileName = UUID.randomUUID() + Objects.requireNonNull(file.getOriginalFilename()).replace(" ", "");
            fileNames.add(fileName);
            String filePath = System.getProperty("user.dir") + "\\housemanager\\src\\main\\resources\\static\\image\\";
            File dept = new File(filePath + fileName);
            try {
                file.transferTo(dept);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //增加checked(文件和房屋信息的映射)表

        for (String fileName : fileNames) {
            System.out.println(fileName);
            Checkes checkes = new Checkes();
            checkes.setHiid(hiid);
            checkes.setCheckpath(fileName);
            checkeService.save(checkes);
        }

        return "ok";
    }

    @PostMapping("/save1")
    public String save1(String[] qiuid, String[] qiucard){
        System.out.println(Arrays.toString(qiuid) + "---" + Arrays.toString(qiucard));

        return "ok";
    }

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile[] files) {
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                return "文件不存在";
            }
            String fileName = UUID.randomUUID() + Objects.requireNonNull(file.getOriginalFilename()).replace(" ", "");
            String filePath = System.getProperty("user.dir") + "\\housemanager\\src\\main\\resources\\static\\image\\";
            File dept = new File(filePath + fileName);
            try {
                file.transferTo(dept);
                return "上传成功";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "success";
    }

}
