package com.aptitudetestapi.test_app.repo;

import com.aptitudetestapi.test_app.model.Topics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepo extends JpaRepository<Topics,Integer> {

    List<Topics> getBySubjectId(int subject_id);
}
