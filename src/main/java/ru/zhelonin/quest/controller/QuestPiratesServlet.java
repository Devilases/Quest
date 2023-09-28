package ru.zhelonin.quest.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ru.zhelonin.quest.entity.Answer;
import ru.zhelonin.quest.entity.Question;
import ru.zhelonin.quest.service.AnswerService;
import ru.zhelonin.quest.service.QuestionService;
import java.io.IOException;


@WebServlet(name = "questPiratesServlet", value = "/questPiratesServlet")
public class QuestPiratesServlet extends HttpServlet {

    AnswerService answerService = new AnswerService();
    QuestionService questionService = new QuestionService();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession currentSession = request.getSession(true);
        Integer counter =(Integer)currentSession.getAttribute("counter");
        if(counter == null){
            currentSession.setAttribute("counter", 1);
            counter = 0;
        }else {
            currentSession.setAttribute("counter", counter + 1);
        }

        Question questionById = questionService.getQuestionById(0);
        Answer answerById1 = answerService.getAnswerById(0);
        Answer answerById2 = answerService.getAnswerById(1);




        request.setAttribute("quest", questionById);
        request.setAttribute("answer1", answerById1);
        request.setAttribute("answer2", answerById2);
        request.setAttribute("counter", counter);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/pirates.jsp");
        requestDispatcher.forward(request,response);


    }


    public void destroy() {
    }


}