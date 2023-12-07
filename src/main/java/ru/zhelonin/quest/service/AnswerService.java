package ru.zhelonin.quest.service;

import ru.zhelonin.quest.entity.Answer;
import ru.zhelonin.quest.repository.AnswerRepository;

public class AnswerService {
    AnswerRepository answerRepository = new AnswerRepository();

    public Answer getAnswerById(Integer id){
        return answerRepository.getAnswerById(id);
    }
    public Answer returnRequiredAnswer1(int id){
        if (id == 1) {
           return answerRepository.getAnswerById(2);
        }else if (id == 2) {
           return answerRepository.getAnswerById(4);
        }
        return null;
    }

    public Answer returnRequiredAnswer2(int id){
        if (id == 1) {
           return answerRepository.getAnswerById(3);
        }else if (id == 2) {
           return answerRepository.getAnswerById(5);
        }
        return null;
    }
}
