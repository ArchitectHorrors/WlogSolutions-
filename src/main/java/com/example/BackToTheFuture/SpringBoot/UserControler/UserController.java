package com.example.BackToTheFuture.SpringBoot.UserControler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private List<User> users = new ArrayList<>();

    public String userIndex(){
        return "USER INDEX";
    }

    @GetMapping ("/{username}")
    public String user(@PathVariable("username") String username){
        User user = new User(username);
        users.add(new User(username));
        users.add(user);
        return "<h1>" + user + "</h1>";
    }

}
