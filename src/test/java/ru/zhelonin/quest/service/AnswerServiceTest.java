package ru.zhelonin.quest.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.zhelonin.quest.repository.AnswerRepository;

import static org.junit.jupiter.api.Assertions.*;

class AnswerServiceTest {
    AnswerRepository answerRepository = new AnswerRepository();
    AnswerService answerService = new AnswerService();

    @Test
    void getAnswerByIdWithId0() {
        assertEquals(answerService.getAnswerById(0), answerRepository.getAnswerById(0));
    }

    @Test
    void returnRequiredAnswer1WithId1() {
        assertEquals(answerService.returnRequiredAnswer1(1), answerRepository.getAnswerById(2));
    }

    @Test
    void returnRequiredAnswer1WithId3() {
        assertNull(answerService.returnRequiredAnswer1(3));
    }

    @Test
    void returnRequiredAnswer2WithId1() {
        assertEquals(answerService.returnRequiredAnswer2(1), answerRepository.getAnswerById(3));
    }

    @Test
    void returnRequiredAnswer2WithId3() {
        assertNull(answerService.returnRequiredAnswer2(3));
    }
}