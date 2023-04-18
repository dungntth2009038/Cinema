package com.fpt.edu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value = "/movie")
public class MovieController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    //    @RequestMapping(value = "/movielist.html")
    @RequestMapping(value = "/movielist")
    public String movielist() {
        return "movielist";
    }

    @RequestMapping(value = "/moviesingle")
    public String moviesingle() {
        return "moviesingle";
    }

    @RequestMapping(value = "/seriessingle")
    public String seriessingle() {
        return "seriessingle";
    }
    @RequestMapping(value = "/blogdetail")
    public String blogdetail() {
        return "blogdetail";
    }

    @RequestMapping(value = "/bloglist")
    public String bloglist() {
        return "bloglist";
    }

    @RequestMapping(value = "/celebritylist")
    public String celebritylist() {
        return "celebritylist";
    }

    @RequestMapping(value = "/celebritysingle")
    public String celebritysingle() {
        return "celebritysingle";
    }

    @RequestMapping(value = "/comingsoon")
    public String comingsoon() {
        return "comingsoon";
    }

    @RequestMapping(value = "/moviegrid")
    public String moviegrid() {
        return "moviegrid";
    }

    @RequestMapping(value = "/moviegridfw")
    public String moviegridfw() {
        return "moviegridfw";
    }

    @RequestMapping(value = "/moviegridfw_light")
    public String moviegridfw_light() {
        return "moviegridfw_light";
    }

    @RequestMapping(value = "/moviesingle_light")
    public String moviesingle_light() {
        return "moviesingle_light";
    }

    @RequestMapping(value = "/seriessingle_light")
    public String seriessingle_light() {
        return "seriessingle_light";
    }

    @RequestMapping(value = "/userfavoritegrid")
    public String userfavoritegrid() {
        return "userfavoritegrid";
    }

    @RequestMapping(value = "/userfavoritelist")
    public String userfavoritelist() {
        return "userfavoritelist";
    }

    @RequestMapping(value = "/userprofile")
    public String userprofile() {
        return "userprofile";
    }

    @RequestMapping(value = "/userrate")
    public String userrate() {
        return "userrate";
    }
}
