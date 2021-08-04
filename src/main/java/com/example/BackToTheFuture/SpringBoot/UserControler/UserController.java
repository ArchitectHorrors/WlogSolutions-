package com.example.BackToTheFuture.SpringBoot.UserControler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    List<User> users = new ArrayList<>();

    public ModelAndView userIndex(ModelAndView view) {
        view.setViewName("user");
        return view;
    }

    @GetMapping("/{username}")
    @ResponseBody
    public String user(@PathVariable("username") String username) {
        return users.stream().filter(u -> u.getName().equals(username)).findFirst().toString();
    }

    @ResponseBody
    @PostMapping
    public User saveUser(@RequestParam(name = "name") String name,
                         @RequestParam(name = "surname") String surname,
                         @RequestParam(name = "image") String imageUrl){
        User user = new User(name, surname, imageUrl);
        users.add(user);

        return user;
    }

    @GetMapping(value = "/print-all", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String printUsers(Model model){
        model.addAllAttributes(users);
        return "user-list";
    }
}