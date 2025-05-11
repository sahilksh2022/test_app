package com.aptitudetestapi.test_app.controller;

import com.aptitudetestapi.test_app.model.Topics;
import com.aptitudetestapi.test_app.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @GetMapping("/topics")
    public ResponseEntity<List<Topics>> getAllTopics(){
        return ResponseEntity.ok(topicService.getAllTopics());
    }

    @GetMapping("/topics/{subject_id}")
    public ResponseEntity<List<Topics>> getBySubjectId(@PathVariable int subject_id){
        return ResponseEntity.ok(topicService.getBySubjectId(subject_id));
    }

    @PostMapping("/topics")
    public ResponseEntity<Topics> insertTopic(@RequestBody Topics topics){

        Topics topics1 = topicService.insertTopic(topics);
        return ResponseEntity.status(HttpStatus.CREATED).body(topics1);
    }
}
