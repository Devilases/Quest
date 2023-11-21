package ru.zhelonin.quest.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.zhelonin.quest.config.PropertiesSessionFactoryProvider;
import ru.zhelonin.quest.entity.Answer;
import ru.zhelonin.quest.entity.Question;

import java.util.Arrays;
import java.util.List;

public class QuestionRepository {

    PropertiesSessionFactoryProvider p = new PropertiesSessionFactoryProvider();
    private SessionFactory sessionFactory = p.getSessionFactory();
    private List<Question> questions = getQuestionsFromDB();

    private List<Question> getQuestionsFromDB(){
        try(Session session = sessionFactory.openSession()){
            Query<Question> query = session.createQuery("from Question", Question.class);
            return query.list();
        }
    }




   // private final List<Question> questions = Arrays.asList(
   //         new Question(0, "Ты просыпаешься от громких звуков на палубе, вдруг к тебе врывается боцмат и сообщает, что впереди то, что вы так давно искали..."),
   //         new Question(1, "Проснувшись, ты понял, что тебе уже 40, а ты так ничего и не достиг и теперь тебе остается лишь созерцать проходящий мир..."),
   //         new Question(2, "Впереди был остров, который был отмечен на старой карте. Спустя 15 минут ты уже стоял на мокром песке и наблюдал за копошащюмися моряками. Вдруг на вас нападает стая огромных лемуров..."),
   //         new Question(3, "Тебе удалось спрятаться в кустах. Со стороны команды доносятся непонятные и страшные вопли. Тебе кажется, что кого-то едят заживо. Ты резко срывешься с места и бежишь несколько минут вглубь острова. К сожалению, не замечаешь обрыв и срываешься вниз...Ты погиб бесславной смертью, так и не выполнив задание."),
   //         new Question(4, "Ты оголил свою саблю, но сразу понял, что она не понадобится. Лемуры лишь интересуются вами. Один даже подошел поближе и дал себя погладить. При этом он издавал очень странный и громкий звук. Если бы ты не видел, что происходит, то подумал, что кого-то убивают. В моменте ты опомнился и понял, что пора искать сокровище..."),
   //         new Question(5, "Наблюдая за гниющим деревом, у тебя появилось странное чувство. Ты приказал матросам рыть рядом с деревом. Спустя 15 минут, раздался заветный звук стука лопатой о ящик. И ты сразу понял, что ты обеспечил прекрасную жизнь себе и нескольким поколениям твоих детей...Можно возращаться домой"),
   //         new Question(6, "В моменте ты вспомнил, что отец учил тебя пологаться только на себя, но было уже поздно. Кратос уже стоял перед тобой. В следующие несколько секунд он убил тебя и всю твою команду...Ты погиб бесславной смертью, так и не выполнив задание.")
   // );

    public Question getQuestionById(Integer id){
        return questions.get(id);
    }
}
