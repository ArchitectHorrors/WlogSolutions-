package com.example.BackToTheFuture.SpringBoot;

import com.example.BackToTheFuture.SpringBoot.About.AboutController;
import com.example.BackToTheFuture.SpringBoot.UserControler.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    private final AboutController aboutController;
    private final UserController userController;

    @Autowired
    public HelloController(AboutController aboutController, UserController userController){
        this.aboutController = aboutController;
        this.userController = userController;
    }

    @GetMapping("/")
    @ResponseBody
    public ModelAndView index(ModelAndView view){
        view.setViewName("index");
        return view;
    }

    @GetMapping("/hello")
    @ResponseBody
    public ModelAndView hello(@RequestParam(name = "name", required = false, defaultValue = " there!")
                        String name, Model model){
        ModelAndView view = new ModelAndView();
        model.addAttribute(name);
        view.setViewName("index");
        return view;
    }

    @GetMapping("/about")
    @ResponseBody
    public String about(){
        return aboutController.AboutUs();
    }

    @GetMapping("/user")
    @ResponseBody
    public ModelAndView userIndex(ModelAndView view){
        return userController.userIndex(view);
    }
}
