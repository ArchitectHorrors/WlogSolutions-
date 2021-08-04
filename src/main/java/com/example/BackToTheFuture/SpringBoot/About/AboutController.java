package com.example.BackToTheFuture.SpringBoot.About;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AboutController {

    public String AboutUs(){
        return "WLOGSolutions";
    }

}
