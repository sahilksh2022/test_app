package com.aptitudetestapi.test_app.service;

import com.aptitudetestapi.test_app.model.Topics;
import com.aptitudetestapi.test_app.repo.TopicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    TopicRepo topicRepo;

    public List<Topics> getAllTopics() {
        return topicRepo.findAll();
    }

    public List<Topics> getBySubjectId(int subject_id) {
        return topicRepo.getBySubjectId(subject_id);
    }

    public Topics insertTopic(Topics topics) {
        return topicRepo.save(topics);
    }
}
