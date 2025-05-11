package com.aptitudetestapi.test_app.service;

import com.aptitudetestapi.test_app.model.Subjects;
import com.aptitudetestapi.test_app.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepo subjectRepo;

    public List<Subjects> getSubjects() {
        return subjectRepo.findAll();
    }


}
