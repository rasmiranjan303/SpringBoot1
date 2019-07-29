package io.springBoot.controller;

import io.springBoot.pojo.Topic;
import io.springBoot.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return topicService.getTopics();
    }

    @GetMapping(value = "/topics/{visit_id}")
    public Topic getTopic(@PathVariable  Long id)
    {
        return topicService.getTopic(id);
    }

    @PostMapping(value = "/topics")
    public void addTopic(@RequestBody  Topic t)
    {
        topicService.addTopic(t);
    }

    @DeleteMapping(value = "/topics")
    public void deleteTopic(@RequestBody Topic t)
    {
        topicService.deleteTopic(t);
    }

    @PutMapping(value = "/topics")
    public void update(@RequestBody  Topic t)
    {
        topicService.updateTopic(t);
    }
}
