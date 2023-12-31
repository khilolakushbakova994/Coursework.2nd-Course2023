package com.example.Coursework.nd.Course2023.controller;

import com.example.Coursework.nd.Course2023.model.Question;
import com.example.Coursework.nd.Course2023.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping
public class ExamController {
    private  final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }


    @GetMapping
    public Collection<Question> getQuestions(int amount){
        return examinerService.getQuestions(5)  ;
    }
}
