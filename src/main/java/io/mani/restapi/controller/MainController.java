package io.mani.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> TopicController() {
           return
    }

    @RequestMapping("/about")
    public String AboutPage() {
        return "This is About page mani !!!";
    }

    @RequestMapping("/contact")
    public String ContactUsPage() {
        return "This is Just for contacting us *******";
    }

    @RequestMapping("/")
    public String NoAddress() {
        return "This is a default Address";
    }



}
