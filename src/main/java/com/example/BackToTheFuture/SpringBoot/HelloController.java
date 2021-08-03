package com.example.BackToTheFuture.SpringBoot;

import com.example.BackToTheFuture.SpringBoot.About.AboutController;
import com.example.BackToTheFuture.SpringBoot.UserControler.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private AboutController aboutControler;
    private UserController userControler;

    @Autowired
    public HelloController(AboutController aboutControler, UserController userControler){
        this.aboutControler = aboutControler;
        this.userControler = userControler;
    }

    @GetMapping("/about")
    public String index(){
        return aboutControler.AboutUs();
    }

    @GetMapping("/user")
    public String user(){
        return userControler.userIndex();
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = " ,there")
                                String name, Model model){
        model.addAttribute(name);

        return "Hello, "+ name;
    }
}
