package ru.zhelonin.quest.service;

import org.junit.jupiter.api.Test;
import ru.zhelonin.quest.repository.AnswerRepository;
import ru.zhelonin.quest.repository.QuestionRepository;

import static org.junit.jupiter.api.Assertions.*;

class QuestionServiceTest {
    QuestionRepository questionRepository = new QuestionRepository();
    QuestionService questionService= new QuestionService();


    @Test
    void getQuestionByIdWithId1() {
        assertEquals(questionService.getQuestionById(1), questionRepository.getQuestionById(1));
    }

    @Test
    void returnRequiredQuestionWithId1() {
        assertEquals(questionService.returnRequiredQuestion(1), questionRepository.getQuestionById(2));
    }

    @Test
    void returnRequiredQuestionWithId3() {
        assertEquals(questionService.returnRequiredQuestion(3), questionRepository.getQuestionById(3));
    }

    @Test
    void returnRequiredQuestionWithId5() {
        assertEquals(questionService.returnRequiredQuestion(5), questionRepository.getQuestionById(6));
    }

    @Test
    void getGameOverWithReturnedQuestionId0() {
        questionService.returnRequiredQuestion(0);
        assertEquals(questionService.getGameOver(), true);
    }
    @Test
    void getGameOverWithReturnedQuestionId1() {
        questionService.returnRequiredQuestion(1);
        assertEquals(questionService.getGameOver(), false);
    }
}