package ru.zhelonin.quest.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.zhelonin.quest.entity.Answer;
import ru.zhelonin.quest.entity.Question;
import ru.zhelonin.quest.service.AnswerService;
import ru.zhelonin.quest.service.QuestionService;
import java.io.IOException;


@WebServlet(name = "questPiratesLogicServlet", value = "/questPiratesLogicServlet")
public class QuestPiratesLogicServlet extends HttpServlet {

    AnswerService answerService = new AnswerService();
    QuestionService questionService = new QuestionService();

    Question questionById;
    Answer answerById1;
    Answer answerById2;
    Boolean gameOver;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id"));
        questionById = questionService.returnRequiredQuestion(id);
        answerById1 = answerService.returnRequiredAnswer1(id);
        answerById2 = answerService.returnRequiredAnswer2(id);
        gameOver = questionService.getGameOver();


        request.setAttribute("newQuest", questionById);
        request.setAttribute("newAnswer1", answerById1);
        request.setAttribute("newAnswer2", answerById2);
        request.setAttribute("gameOver", gameOver);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/pirates.jsp");
        requestDispatcher.forward(request,response);

    }
}