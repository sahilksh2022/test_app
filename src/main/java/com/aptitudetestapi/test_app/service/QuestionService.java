package com.aptitudetestapi.test_app.service;

import com.aptitudetestapi.test_app.dto.QuestionDTO;
import com.aptitudetestapi.test_app.model.Options;
import com.aptitudetestapi.test_app.model.Questions;
import com.aptitudetestapi.test_app.repo.QuestionsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionsRepository questionsRepository;

    public QuestionDTO getRandomQuestionByTopicId(int topicId) {
        Questions question = questionsRepository.findRandomQuestionByTopicId(topicId);

        if (question == null) {
            return null; // Handle case where no question is found
        }

        // Convert to DTO
        QuestionDTO questionDTO = new QuestionDTO();
//        questionDTO.setId(question.getId());
        questionDTO.setQuestion(question.getQuestion());
        questionDTO.setAnswer(question.getAnswer());
        questionDTO.setExplanation(question.getExplanation());
//        questionDTO.setTopicId(question.getTopics().getId());
//        questionDTO.setTopicName(question.getTopics().getTopic_name());
//        questionDTO.setSubjectId(question.getTopics().getSubject().getId());
//        questionDTO.setSubjectName(question.getTopics().getSubject().getSubject_name());

        // Extract options as a list of strings
        questionDTO.setOptions(
                question.getOptions().stream().map(Options::getOptionText).collect(Collectors.toList())
        );

        return questionDTO;
    }
}
