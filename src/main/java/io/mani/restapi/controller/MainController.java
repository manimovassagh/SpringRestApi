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
        return topicService.getAllTopics();
    }

    public Topic getTopic(String id) {
        return topicService.getTopic(id);
    }

}
