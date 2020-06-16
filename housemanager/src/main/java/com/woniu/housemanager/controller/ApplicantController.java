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

    @PostMapping("/save")
    @ResponseBody
    public String save(String[] aname, String[] acard, String[] aphone, String[] aaddress,
        QiuDiHao qiuDiHao, HouseInfo houseInfo, String[] commonway, String[] commonshare) {
        //根据共有人数量添加到数据库
        List<Integer> aid = new ArrayList<>();

        for (int i = 0; i < aname.length; i++) {
            Applicant applicant = new Applicant();
            applicant.setAname(aname[i]);
            applicant.setAcard(acard[i]);
            applicant.setAphone(aphone[i]);
            applicant.setAadress(aaddress[i]);
            applicantService.save(applicant);
            aid.add(applicant.getAid());
        }
        //增加丘地号
        qiuDiHaoService.save(qiuDiHao);
        //增加共有人信息
        Commoninfo commoninfo = new Commoninfo();
        for (int i = 0; i < aid.size(); i++) {
            commoninfo.setAid(aid.get(i));
            commoninfo.setCommonway(commonway[i]);
            commoninfo.setCommonshare(commonshare[i]);
            commoninfoService.save(commoninfo);
        }

        //增加房屋信息
        houseInfo.setQiuid(qiuDiHao.getQiuid());
        houseInfo.setHnid(Integer.parseInt(GenerateCode.getHouseCode()));
        houseInfoService.save(houseInfo);

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


        return "ok";
    }

    @PostMapping("/save1")
    public String save1(QiuDiHao qiuDiHao, HttpServletRequest httpServletRequest){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String filePath = "/image/" + sdf.format(new Date());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(httpServletRequest.getServletContext().getRealPath("/") + "---");
        System.out.println(httpServletRequest.getServletPath() + "---");
        System.out.println(httpServletRequest.getLocalAddr() + "===");
        System.out.println(qiuDiHao.getQiuid() + "---" + qiuDiHao.getQiucard());

        return "ok";
    }

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        if (file.isEmpty()){
            return "文件不存在";
        }
        String fileName = UUID.randomUUID() + Objects.requireNonNull(file.getOriginalFilename()).replace(" ","");
        String filePath = System.getProperty("user.dir") + "\\housemanager\\src\\main\\resources\\static\\image\\";
        File dept = new File(filePath + fileName);
        try {
            file.transferTo(dept);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
