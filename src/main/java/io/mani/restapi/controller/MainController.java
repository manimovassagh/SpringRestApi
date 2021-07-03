package io.mani.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping("/topics")
    public List<Topic> HomePage() {
        return Arrays.asList(
                new Topic("1", "Angular", "A Good Framework to handle Front end"),
                new Topic("2", "React", "A Good Facebook Framework to handle Front end"),
                new Topic("3", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
                new Topic("4", "Node Js", "The best way to handle backend fast reliable and secure "),
                new Topic("1", "Angular", "A Good Framework to handle Front end"),
                new Topic("2", "React", "A Good Facebook Framework to handle Front end"),
                new Topic("3", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
                new Topic("4", "Node Js", "The best way to handle backend fast reliable and secure "),
                new Topic("1", "Angular", "A Good Framework to handle Front end"),
                new Topic("2", "React", "A Good Facebook Framework to handle Front end"),
                new Topic("3", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
                new Topic("4", "Node Js", "The best way to handle backend fast reliable and secure "),
                new Topic("1", "Angular", "A Good Framework to handle Front end"),
                new Topic("2", "React", "A Good Facebook Framework to handle Front end"),
                new Topic("3", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
                new Topic("4", "Node Js", "The best way to handle backend fast reliable and secure ")


        );
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
