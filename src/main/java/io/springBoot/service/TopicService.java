package io.springBoot.service;

import io.springBoot.dao.TopicDao;
import io.springBoot.dao.TopicRepository;
import io.springBoot.pojo.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1l,"Spring", "Spring Fw"),new Topic(2l,"Azure","Microsoft Azure")));

    @Autowired
    TopicDao topicDao;

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public void test()
    {
        System.out.println(topics.get(0).getDescription()+"ppppppppppppppppppppppppppppppppp");
    }


    public Topic getTopic(Long id) {

        return topicRepository.findById(String.valueOf(id)).get();
    }

    public void addTopic(Topic t) {
        topicRepository.save(t);
    }

    public void deleteTopic(Topic t) {
        topicRepository.delete(t);
    }

    public void updateTopic(Topic t) {
        topicRepository.save(t);
    }
}
