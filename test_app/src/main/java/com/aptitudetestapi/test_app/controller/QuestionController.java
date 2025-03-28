package com.aptitudetestapi.test_app.controller;

import com.aptitudetestapi.test_app.dto.QuestionDTO;
import com.aptitudetestapi.test_app.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("questions/{topicId}")
    public ResponseEntity<QuestionDTO> getRandomQuestion(@PathVariable int topicId) {
        QuestionDTO questionDTO = questionService.getRandomQuestionByTopicId(topicId);

        if (questionDTO == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(questionDTO);
    }
}
