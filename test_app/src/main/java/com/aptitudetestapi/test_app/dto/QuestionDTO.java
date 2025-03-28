package com.aptitudetestapi.test_app.dto;

import lombok.Data;
import java.util.List;

@Data
public class QuestionDTO {
//    private int id;
    private String question;
    private String answer;
    private String explanation;
//    private int topicId;
//    private String topicName;
//    private int subjectId;
//    private String subjectName;
    private List<String> options;
}

