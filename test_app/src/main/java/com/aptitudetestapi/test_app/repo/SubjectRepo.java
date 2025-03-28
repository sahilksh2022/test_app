package com.aptitudetestapi.test_app.repo;

import com.aptitudetestapi.test_app.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subjects,Integer> {
}
