package com.liwenshuo.cont;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("accountController")
@RequestMapping("/account")
public class AccountController {
    @RequestMapping(value = "/findAccount",method = RequestMethod.POST)
    public String findAccount(Integer accountId){
        System.out.println("查询了账户Spring"+accountId);
        return "success";
    }
}
