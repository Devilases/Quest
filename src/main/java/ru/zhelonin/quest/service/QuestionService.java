package ru.zhelonin.quest.service;

import ru.zhelonin.quest.entity.Question;
import ru.zhelonin.quest.repository.QuestionRepository;

public class QuestionService {
    QuestionRepository questionRepository = new QuestionRepository();
    Boolean gameOver = false;
    public Question getQuestionById(Integer id){
        return questionRepository.getQuestionById(id);
    }
    public Question returnRequiredQuestion(Integer id){
        if(id == 0){
            gameOver = true;
            return questionRepository.getQuestionById(1);
        } else if (id == 5) {
            gameOver = true;
            return questionRepository.getQuestionById(6);
        } else if (id == 2) {
            gameOver = false;
            return questionRepository.getQuestionById(4);
        } else if (id == 3) {
            gameOver = true;
            return questionRepository.getQuestionById(3);
        }else if (id == 4) {
            gameOver = true;
            return questionRepository.getQuestionById(5);
        }else if (id == 1) {
            gameOver = false;
            return questionRepository.getQuestionById(2);
        }
        return null;
    }

    public Boolean getGameOver(){
        return gameOver;
    }
}
