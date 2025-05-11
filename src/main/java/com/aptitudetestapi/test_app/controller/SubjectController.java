package com.aptitudetestapi.test_app.controller;

import com.aptitudetestapi.test_app.model.Subjects;
import com.aptitudetestapi.test_app.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping("/subjects")
    public ResponseEntity<List<Subjects>> getSubjects(){
        return ResponseEntity.ok(subjectService.getSubjects());
    }

}
