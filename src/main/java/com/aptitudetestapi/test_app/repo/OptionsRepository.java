package com.aptitudetestapi.test_app.repo;

import com.aptitudetestapi.test_app.model.Options;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionsRepository extends JpaRepository<Options, Integer> {
    List<Options> findByQuestionId(int questionId);
}
