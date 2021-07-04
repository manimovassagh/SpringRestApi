package io.mani.restapi.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("angular", "Angular course", "A Good Framework to handle Front end"),
            new Topic("react", "React  boot camp", "A Good Facebook Framework to handle Front end"),
            new Topic("spring", "Spring Boot", "A Good Framework to handle back end for enterprise apps"),
            new Topic("node", "Node Js", "The best way to handle backend fast reliable and secure "),
            new Topic("nest", "Nest Js", "The out of the Box handle backend solution "),
            new Topic("svelte", "Svelte", "The Future if front end technology ")

    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopics(Topic topic) {
        topics.add(topic);
    }
}
