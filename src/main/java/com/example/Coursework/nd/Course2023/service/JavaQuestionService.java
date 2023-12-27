package com.example.Coursework.nd.Course2023.service;

import com.example.Coursework.nd.Course2023.model.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor

public class JavaQuestionService implements QuestionService {
    Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question questionAndAnswer = new Question();
        questions.add(questionAndAnswer);

        return questionAndAnswer ;
    }

    @Override
    public Question addOnlyQuestion(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);

        }
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return List.copyOf(questions);
    }

    @Override
    public Question getRandomQuestion() {
        Random randomQuestion = new Random();
        int q = randomQuestion.nextInt(questions.size());
        return new  ArrayList<>(questions).get(q);
    }
}
