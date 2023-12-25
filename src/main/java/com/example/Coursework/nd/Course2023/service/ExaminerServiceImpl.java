package com.example.Coursework.nd.Course2023.service;


import com.example.Coursework.nd.Course2023.exceptions.NoMoreQuestionsException;
import com.example.Coursework.nd.Course2023.model.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ExaminerServiceImpl implements ExaminerService {
    private Random random;
    //почему нужно писть ?/////

    private final QuestionService questionService;

    @Override
    public Collection<Question> getQuestions(int amount) {
        int existQuestionAmount = questionService.getAll().size();
        if (existQuestionAmount>=amount){
            throw new NoMoreQuestionsException("Максимальное количество вопросов!");
        }
        Set<Question> result = new HashSet<>();
        while (result.size()<=amount){
            result.add(questionService.getRandomQuestion());
        }

        return result;
    }
}
