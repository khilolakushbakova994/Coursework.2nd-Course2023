package com.example.Coursework.nd.Course2023.service;

import com.example.Coursework.nd.Course2023.model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaQuestionServiceTest {
    private JavaQuestionService out;

    private final Question FIRST_QUESTION = new Question("Какие циклы вы знаете, в чем их отличия?", "Ответ1");
    private final Question SECOND_QUESTION = new Question("Методы каких типов бывают? Приведите примеры использования каждого типа.", "Ответ2");
    private final Question THIRD_QUESTION = new Question("Расскажите о переменных примитивного и ссылочного типа. В чём различия данных переменных?", "Ответ2");

    @BeforeEach
    public void setUp() {
        out = new JavaQuestionService();

    }

    @Test
    void addQuestionAndAnswer() {
        out.add("Какие условные операторы вы знаете? Дайте краткое определение каждому из них",
                "if, if-else и switch");

        assertEquals(1, out.getAll().size());
    }

    @Test
    void testAddOnlyQuestion() {
        Question addedQuestion = out.addOnlyQuestion(FIRST_QUESTION);
        assertEquals(addedQuestion, FIRST_QUESTION);

    }

    @Test
    void remove() {
        out.addOnlyQuestion(FIRST_QUESTION);
        assertEquals(1, out.getAll().size());
        out.remove(FIRST_QUESTION);
        assertEquals(0, out.getAll().size());


    }

    @Test
    void getAllQuestions() {
        out.addOnlyQuestion(FIRST_QUESTION);
        out.addOnlyQuestion(SECOND_QUESTION);
        out.addOnlyQuestion(THIRD_QUESTION);
        List<Question> expected = List.of(
                new Question("Какие циклы вы знаете, в чем их отличия?", "Ответ1"),
                new Question("Методы каких типов бывают? Приведите примеры использования каждого типа.", "Ответ2"),
                new Question("Расскажите о переменных примитивного и ссылочного типа. В чём различия данных переменных?", "Ответ3"));
        List<Question> result = (List<Question>) out.getAll();
        assertEquals(expected.size(), result.size());


    }
}