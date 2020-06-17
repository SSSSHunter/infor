package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.*;
import com.woniu.housemanager.service.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 一般抵押的所有业务
 */
@RestController
@RequestMapping("/mortgagesapply")
public class MortgagesapplyController {

    @Resource
    private MortgageService mortgageService;
    @Resource
    private HouseInfoService houseInfoService;
    @Resource
    private DebtService debtService;
    @Resource
    private BussnessstatusService bussnessstatusService;
    @Resource
    private MortgagesTransferService mortgagesTransferService;
    @Resource
    private MortgagesChangeService mortgagesChangeService;


    //一般抵押登记申请
    @PostMapping("/save")
    public void save(Applicant a,String[] names,String[] comphones, String[] cards,
                     String mortgagemoney,String mortgagescope,
                     String mortgagestart,String mortgageend,String propertyrightcode) throws ParseException {
        //System.out.println("==================================================================");
        //根据房产证号得到房屋信息
        HouseInfo h  = houseInfoService.selectByPropertyrightcode(propertyrightcode);
        //System.out.println("房屋id"+h.getHiid());


        //插入申请人(抵押人，也就是债务人)
        Debt d = new Debt();
        d.setDebtname(names[0]);
        d.setDebtcard(cards[0]);
        d.setDeptphone(comphones[0]);
        d.setDeptinfo("抵押人");
        debtService.insert(d);
        Integer debtid = d.getDebt();
        //插入抵押权人
        Debt debt = new Debt();
        debt.setDebtname(a.getAname());
        debt.setDebtcard(a.getAcard());
        debt.setDeptphone(a.getAphone());
        debt.setDeptinfo("抵押权人");
        debtService.insert(debt);


        //一般抵押登记表
        Mortgage mortgage = new Mortgage();
        mortgage.setHiid(h.getHiid());
        mortgage.setDebt(d.getDebt());
        mortgage.setBdid(25);
        mortgage.setMortgagemoney( new BigDecimal(mortgagemoney));
        mortgage.setMortgagescope(mortgagescope);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(mortgagestart);
        mortgage.setMortgagestart(date);
        mortgage.setMortgageend(simpleDateFormat.parse(mortgageend));
        //抵押编码
        String code = (simpleDateFormat.format(date).replace("-","")+ (Math.random()*10)).replace(".","").substring(0,13);
        mortgage.setMortgagecode(code);
        //System.out.println(code);
        //抵押人id
        mortgage.setDebt(debtid);
        mortgageService.insert(mortgage);
        Integer mortgageid = mortgage.getMortgageid();


        //插入业务状态表
        Bussnessstatus bussnessstatus = new Bussnessstatus();
        //用抵押编码做业务编号
        bussnessstatus.setBsid(code);
        bussnessstatus.setHiid(h.getHiid());
        //System.out.println("----------------"+mortgageid);
        bussnessstatus.setMortgageid(mortgageid);
        bussnessstatus.setBsstatus("已受理");
        bussnessstatus.setBsdate(date);
        bussnessstatus.setAname(d.getDebtname());
        bussnessstatus.setAcard(d.getDebtcard());
        //设置受理人id
        bussnessstatus.setWorkid(1);
        bussnessstatusService.insert(bussnessstatus);

    }
    //根据抵押人得到他项权证号
    @PostMapping("/findmortgagecode")
    public String findmortgagecode(String debtname){
        //System.out.println(debtname);
        Debt debt = debtService.selectBydebtname(debtname);
        Mortgage mortgage =  mortgageService.selectBydebt(debt.getDebt());
        //System.out.println(mortgage.getMortgagecode());
        return mortgage.getMortgagecode();
    }
    //根据抵押人得到房产证号
    @PostMapping("/findpropertyrightcode")
    public String findpropertyrightcode(String debtname){
        //System.out.println(debtname);
        Debt debt = debtService.selectBydebtname(debtname);
        Mortgage mortgage =  mortgageService.selectBydebt(debt.getDebt());
        HouseInfo houseInfo = houseInfoService.selectByHiid(mortgage.getHiid());
        return houseInfo.getPropertyrightcode();
    }
    //一般抵押转移
    @PostMapping("/transfer")
    public void transfer(Applicant a,String[] names,String[] comphones, String[] cards){

        //根据抵押权转让人的名字a.getaname找到debt
        // 在他项权转移表中 插入关系  debt的主键 抵押权受让人的名字,身份证号，电话，names[0],cards[0]，comphones[0]
        Debt debt = debtService.selectBydebtname(a.getAname());
        System.out.println(debt.getDebtname());
        MortgagesTransfer mortgagesTransfer = new MortgagesTransfer();
        mortgagesTransfer.setDebt(debt.getDebt());
        mortgagesTransfer.setMtcard(cards[0]);
        mortgagesTransfer.setMtname(names[0]);
        mortgagesTransfer.setMtphone(comphones[0]);
        mortgagesTransferService.insert(mortgagesTransfer);
        System.out.println(mortgagesTransfer.getMtname());

        //得到抵押人的信息
        Debt debt1 = debtService.selectBydebtname(names[1]);
        //得到房产信息
        Mortgage mortgage =  mortgageService.selectBydebt(debt1.getDebt());
        HouseInfo houseInfo = houseInfoService.selectByHiid(mortgage.getHiid());
        //插入到他项权的表
        Mortgage mortgage1 = new Mortgage();
        mortgage1.setDebt(debt1.getDebt());
        mortgage1.setHiid(houseInfo.getHiid());
        mortgage1.setBdid(39);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String code = (simpleDateFormat.format(new Date()).replace("-","")+ (Math.random()*10)).replace(".","").substring(0,13);
        mortgage1.setMortgagecode(code);
        mortgageService.insert(mortgage1);
        Integer mortgageid = mortgage1.getMortgageid();

        //插入业务状态表
        Bussnessstatus bussnessstatus = new Bussnessstatus();
        bussnessstatus.setMortgageid(mortgageid);
        bussnessstatus.setBsstatus("已受理");
        bussnessstatus.setBsid(code);
        bussnessstatus.setBsdate(new Date());
        bussnessstatus.setHiid(houseInfo.getHiid());
        //抵押权转让人 为申请人
        bussnessstatus.setAname(a.getAname());
        bussnessstatus.setAcard(a.getAcard());
        //设置受理人id
        bussnessstatus.setWorkid(1);
        bussnessstatusService.insert(bussnessstatus);
    }


    //一般抵押变更
    @PostMapping("/change")
    public void change(String[] names,String[] cards,MortgagesChange mortgagesChange,String[] changes){
//        System.out.println("------------------------------------------");
//        System.out.println(Arrays.toString(names));
//        System.out.println("------------------------------------------");
//        System.out.println(mortgagesChange.getHouseaddress()+"--"+mortgagesChange.getPropertyrightcode()+"--"+mortgagesChange.getMortgagecode());
//        System.out.println("------------------------------------------");
//        System.out.println(Arrays.toString(changes));
//        System.out.println("------------------------------------------");
        if(names[0].equals(changes[0])){
            mortgagesChange.setMortgagername(changes[1]);
            System.out.println(mortgagesChange.getMortgagername());
        }else if(names[1].equals(changes[0])){
            mortgagesChange.setMortgageename(changes[1]);
            System.out.println(mortgagesChange.getMortgageename());
        }else{
            mortgagesChange.setHouseaddress(changes[1]);
            System.out.println(mortgagesChange.getHouseaddress());
        }

        //得到房产信息
        HouseInfo houseInfo = houseInfoService.selectByPropertyrightcode(mortgagesChange.getPropertyrightcode());

        //插入变更表
        mortgagesChangeService.insert(mortgagesChange);
        //插入到他项权的表
        Mortgage mortgage = new Mortgage();
        mortgage.setHiid(houseInfo.getHiid());
        mortgage.setBdid(32);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String code = (simpleDateFormat.format(new Date()).replace("-","")+ (Math.random()*10)).replace(".","").substring(0,13);
        mortgage.setMortgagecode(code);
        mortgageService.insert(mortgage);
        Integer mortgageid = mortgage.getMortgageid();



        //插入业务状态表
        Bussnessstatus bussnessstatus = new Bussnessstatus();
        bussnessstatus.setMortgageid(mortgageid);
        bussnessstatus.setBsstatus("已受理");
        bussnessstatus.setBsid(code);
        bussnessstatus.setBsdate(new Date());
        bussnessstatus.setHiid(houseInfo.getHiid());
        //抵押人 为申请人
        bussnessstatus.setAname(names[1]);
        bussnessstatus.setAcard(cards[1]);
        //设置受理人id
        bussnessstatus.setWorkid(1);
        bussnessstatusService.insert(bussnessstatus);


//        //根据抵押权转让人的名字a.getaname找到debt 修改信息
//        Debt debt = debtService.selectBydebtname(a.getAname());
//        System.out.println(debt.getDebtname());
//        MortgagesTransfer mortgagesTransfer = new MortgagesTransfer();
//        mortgagesTransfer.setDebt(debt.getDebt());
//        mortgagesTransfer.setMtcard(cards[0]);
//        mortgagesTransfer.setMtname(names[0]);
//        mortgagesTransfer.setMtphone(comphones[0]);
//        mortgagesTransferService.insert(mortgagesTransfer);
//        System.out.println(mortgagesTransfer.getMtname());
//
//        //得到抵押人的信息 修改信息
//        Debt debt1 = debtService.selectBydebtname(names[1]);
//        //得到房产信息  修改地址
//        Mortgage mortgage =  mortgageService.selectBydebt(debt1.getDebt());
//        HouseInfo houseInfo = houseInfoService.selectByHiid(mortgage.getHiid());
//        //插入到他项权的表
//        Mortgage mortgage1 = new Mortgage();
//        mortgage1.setDebt(debt1.getDebt());
//        mortgage1.setHiid(houseInfo.getHiid());
//        mortgage1.setBdid(39);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String code = (simpleDateFormat.format(new Date()).replace("-","")+ (Math.random()*10)).replace(".","").substring(0,13);
//        mortgage1.setMortgagecode(code);
//        mortgageService.insert(mortgage1);
//        Integer mortgageid = mortgage1.getMortgageid();
//
//        //插入业务状态表
//        Bussnessstatus bussnessstatus = new Bussnessstatus();
//        bussnessstatus.setMortgageid(mortgageid);
//        bussnessstatus.setBsstatus("已受理");
//        bussnessstatus.setBsid(code);
//        bussnessstatus.setBsdate(new Date());
//        bussnessstatus.setHiid(houseInfo.getHiid());
//        //抵押权受让人 为申请人
//        bussnessstatus.setAname();
//        bussnessstatus.setAcard();
//        //设置受理人id
//        bussnessstatus.setWorkid(1);
//        bussnessstatusService.insert(bussnessstatus);
    }
}

