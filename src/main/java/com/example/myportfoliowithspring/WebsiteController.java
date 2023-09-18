package com.example.myportfoliowithspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {
    @GetMapping("")
    public String getHomePage(){
        return "index";
    }


    @GetMapping("resume")
    public String showResumePage(){
        return "resume";

    }

    @GetMapping("contact")
    public String showContactPage() {
        return "contact";

    }

}
