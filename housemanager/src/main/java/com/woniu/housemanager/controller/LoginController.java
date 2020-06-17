package com.woniu.housemanager.controller;

import com.woniu.housemanager.pojo.UserInfo;
import com.woniu.housemanager.service.UserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class LoginController {
    @Resource
    UserInfoService userInfoService;
    @GetMapping("/login")
    public String login( UserInfo info){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(info.getUname(), info.getUpass());
        try {
            subject.login(token);
            return "ok";
        }catch (UnknownAccountException ae) {
            return "账号不对";
        }catch (IncorrectCredentialsException ae) {
            return "/密码不对";
        } catch (Exception ae) {
            return "/index";
        }
    }
    @GetMapping("/getZtree")
    public String getTree(HttpServletRequest request){
        String json= (String) request.getSession().getAttribute("json");
        
        return  json;
    }
    @GetMapping("/findall")
    public List<UserInfo> findAll(){
        List<UserInfo> list=userInfoService.findAll();
        return  list;
    }

    @GetMapping("/admin/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();//session.invaliate();
        return "redirect:/toindex.jsp";
    }
}
