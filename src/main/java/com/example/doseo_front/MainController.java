package com.example.doseo_front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class MainController {


//    @GetMapping("/main")
//    public String mainPage(){
//        return "main";
//    }
   @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
//    @GetMapping("/signup")
//    public String signupPage() {
//        return "signup";
//    }*/
/*    @GetMapping("/register")
    public String insertPage() {
        return "book-insert";
    }*/
}
