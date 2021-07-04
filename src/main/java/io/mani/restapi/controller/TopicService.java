package io.mani.restapi.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("angular", "Angular course", "A Good Framework to handle Front end"),
            new Topic("react", "React  boot camp", "A Good Facebook Framework to handle Front end"),
            new Topic("spring", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
            new Topic("node", "Node Js", "The best way to handle backend fast reliable and secure "),
            new Topic("nest", "Nest Js", "The out of the Box handle backend solution "),
            new Topic("svelte", "Svelte", "The Future if front end technology ")

    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopics(Topic topic) {
        topics.add(topic);
    }

    public void updateTopics(String id , Topic topic) {
        for (int i =0; i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }
}
