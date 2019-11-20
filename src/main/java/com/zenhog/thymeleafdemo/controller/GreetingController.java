package com.zenhog.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping({"","/","/index","/index.html"})
    public String getIndex(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping({"/about","/about.html"})
    public String getAbout(){
        return "about";
    }

    @GetMapping({"/contact","/contact.html"})
    public String getContact(){
        return "contact";
    }

    @GetMapping({"/post","/post.html"})
    public String getPost(){
        return "post";
    }

}
