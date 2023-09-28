package ru.zhelonin.quest.repository;

import ru.zhelonin.quest.entity.Answer;

import java.util.Arrays;
import java.util.List;

public class AnswerRepository {
    private final List<Answer> answers = Arrays.asList(
            new Answer(0, "Продолжить спать"),
            new Answer(1, "Начать одеваться"),
            new Answer(2, "Жестоко сражаться"),
            new Answer(3, "Попытаться спрятаться и сбежать"),
            new Answer(4, "Воспользоваться своей интуицией"),
            new Answer(5, "Прибегнуть к старинной магии и вызвать Кратоса")
    );

    public Answer getAnswerById(Integer id){
        return answers.get(id);
    }
}
