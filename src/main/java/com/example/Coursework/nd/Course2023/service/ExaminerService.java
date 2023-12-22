package com.example.Coursework.nd.Course2023.service;

import com.example.Coursework.nd.Course2023.model.Question;
import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions (int amount);
}
