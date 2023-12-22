package com.example.Coursework.nd.Course2023.controller;


import com.example.Coursework.nd.Course2023.model.Question;
import com.example.Coursework.nd.Course2023.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping ("/exam/java")
public class JavaQuestionController {
    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }


    @GetMapping ("/add")
    Question addQuestion (String question, String answer){
        return service.add(question, answer);
    }


    @GetMapping ("/remove")
    Question removeQuestion (Question question){
        return service.remove(question);
    }


    @GetMapping
    Collection<Question> getQuestions () {
        return service.getAll();
    }




}
