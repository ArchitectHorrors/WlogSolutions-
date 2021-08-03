package com.example.BackToTheFuture.SpringBoot.About;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {

    public String AboutUs(){
        String aboutUs = "WLOG Solutions";
        return aboutUs;
    }

}
