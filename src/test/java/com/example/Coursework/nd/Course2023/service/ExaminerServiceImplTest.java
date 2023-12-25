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
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    QuestionService questionServiceMock;

    @InjectMocks
    private ExaminerServiceImpl out;

    private static final Question FIRST_QUESTION = new Question ("Какие циклы вы знаете, в чем их отличия?","Ответ1");
    private static final  Question SECOND_QUESTION = new Question("Методы каких типов бывают? Приведите примеры использования каждого типа.", "Ответ2");
    private  static final  Question THIRD_QUESTION = new Question("Расскажите о переменных примитивного и ссылочного типа. В чём различия данных переменных?", "Ответ3");


    @Test
    public  void getQuestions() {
        when(questionServiceMock.getRandomQuestion())
                .thenReturn(FIRST_QUESTION, SECOND_QUESTION, THIRD_QUESTION);
        assertEquals(out.getQuestions(1).size(), 1);
    }
}