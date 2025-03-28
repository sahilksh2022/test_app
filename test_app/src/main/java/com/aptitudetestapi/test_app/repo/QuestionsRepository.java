package com.aptitudetestapi.test_app.repo;

import com.aptitudetestapi.test_app.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

    @Query(value = "SELECT * FROM questions WHERE topic_id = :topicId ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Questions findRandomQuestionByTopicId(@Param("topicId") int topicId);
}
