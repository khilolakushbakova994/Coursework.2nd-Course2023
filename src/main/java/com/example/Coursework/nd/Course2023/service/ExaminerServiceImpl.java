package com.example.Coursework.nd.Course2023.service;


import com.example.Coursework.nd.Course2023.exceptions.NoMoreQuestionsException;
import com.example.Coursework.nd.Course2023.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private Random random;
    //почему нужно писть ?/////

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        questionService.getRandomQuestion();
        if (questionService.getAll().size()>=amount){
            throw new NoMoreQuestionsException("Максимальное количество вопросов!");
        }
        return questionService.getAll();
    }
}
