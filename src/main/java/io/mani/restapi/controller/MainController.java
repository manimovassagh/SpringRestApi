package io.mani.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> TopicController() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/")
    public String HomePage() {
        return "This ia s Home Page ";}


    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopics(topic);
    }

}
