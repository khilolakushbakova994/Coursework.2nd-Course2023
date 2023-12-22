package com.example.Coursework.nd.Course2023.service;


import com.example.Coursework.nd.Course2023.model.Question;

import java.util.Collection;

public interface QuestionService {
    Question add (String question, String answer);

    Question addOnlyQuestion (Question question);

    Question remove (Question question);

    Collection<Question> getAll ();

    Question getRandomQuestion ();

}
