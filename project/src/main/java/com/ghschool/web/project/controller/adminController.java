package com.ghschool.web.project.controller;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@OpenAPIDefinition(info =@Info(title = "Controller API", version = "1.0", description = "Controller API for Admin"))
@RequestMapping(value = "/adminController")
public class adminController {

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public String adminHomePage(){
        return "<h1>admin home page</h1>";
    }

    @RequestMapping(value = "/loginPage",method = RequestMethod.GET)
    public String adminLoginPage(){
        return "<h1>admin login page</h1>";
    }

    @RequestMapping(value = "/logoutPage",method = RequestMethod.GET)
    public String adminLogoutPage(){
        return "<h1>admin logout page</h1>";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String adminRegisterPage(){
        return "<h1>admin register page</h1>";
    }
}
