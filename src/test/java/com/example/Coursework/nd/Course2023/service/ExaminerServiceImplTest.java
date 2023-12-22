package com.example.Coursework.nd.Course2023.service;


import com.example.Coursework.nd.Course2023.model.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Collection;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    private  final Question FIRST_QUESTION = new Question ("Какие циклы вы знаете, в чем их отличия?");
    @Mock
    QuestionService questionServiceMock;

    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    void getQuestions() {
        Collection<Question> expected = out.getQuestions(1);
        List<Question> result = (List<Question>) FIRST_QUESTION;
        assertEquals(expected.size(),result.size());
    }
}