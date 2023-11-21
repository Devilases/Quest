package ru.zhelonin.quest.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zhelonin.quest.entity.Answer;
import ru.zhelonin.quest.entity.Question;

public class PropertiesSessionFactoryProvider {
    public SessionFactory getSessionFactory(){
        return new Configuration()
                .addAnnotatedClass(Answer.class)
                .addAnnotatedClass(Question.class)
                .buildSessionFactory();
    }
}
