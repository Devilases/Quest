<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
    <title>Остров сокровищ</title>
</head>
<body>
<h1><%= "Пиратское золото" %></h1>

${requestScope.quest.getText()}
${requestScope.newQuest.getText()}
<br>
<br>
<br>

<c:if test="${quest.id == 0}">
<a href="questPiratesLogicServlet?id=${answer1.id}" class="btn btn-primary btn-default">${requestScope.answer1.getText()}</a>
<a href="questPiratesLogicServlet?id=${answer2.id}" class="btn btn-primary btn-default">${requestScope.answer2.getText()}</a>
</c:if>
<c:if test="${newQuest.id == 2 || newQuest.id == 4}">
<a href="questPiratesLogicServlet?id=${newAnswer1.id}" class="btn btn-primary btn-default">${requestScope.newAnswer1.getText()}</a>
<a href="questPiratesLogicServlet?id=${newAnswer2.id}" class="btn btn-primary btn-default">${requestScope.newAnswer2.getText()}</a>
</c:if>




<br>
<br>
<c:if test="${gameOver == true}">
    <a href="/Quest_war_exploded/questPiratesServlet" class="btn btn-primary btn-default">Попробовать еще раз</a>
</c:if>
<br>
<c:if test="${quest.id == 0}">
    Cыграно игр: ${requestScope.counter}
</c:if>


</body>
</html>
