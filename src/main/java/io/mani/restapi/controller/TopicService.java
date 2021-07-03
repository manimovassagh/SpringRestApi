package io.mani.restapi.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Angular", "A Good Framework to handle Front end"),
            new Topic("2", "React", "A Good Facebook Framework to handle Front end"),
            new Topic("3", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
            new Topic("4", "Node Js", "The best way to handle backend fast reliable and secure ")

            );

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
