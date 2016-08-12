<%@page import="entity.Topic"%>
<%@page import="entity.dao.TopicDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Инспектор</title>
        <link rel="shortcut icon" href="images/search.png">
        <link href="css/style_index.css" rel="stylesheet" type="text/css"/>
        <link href="css/popup.css" rel="stylesheet" type="text/css"/>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script src="js/popup.js" type="text/javascript"></script>
    </head>
    <body>

        <header>
            <div class="logo">
                <span>I</span>nspector
            </div>
            
            <div class="searchForm">
                <input class="entryField" type="text" placeholder="SEARCH"/>
            </div>

            <div class="authorization">
                <input class="login" style="text-align: center" type="text" name="login" value="" size="20" placeholder="Логин"/>
                <input class="logIN" type="submit" value="Log in" name="logIn"/>
                <input class="signUp" type="submit" value="Sign up" name="signUp"/>
            </div>
        </header>  
            
        <div class="Left">
            
            <jsp:useBean id="topicList" class="entity.dao.TopicDAO" scope="application"/>
            <% request.getServletContext().setAttribute("TopicList", TopicDAO.getAllTopic());%>
            <c:forEach var="topic" items="${topicList.getAllTopic()}">
                <li><input class="topic" type="submit" value="${topic.name}" name="${topic.name}"/></li>
            </c:forEach>
                <li id="add"><input class="add" type="submit" value="ДОБАВИТЬ ВОПРОС" name="Добавить вопрос"/></li>
        </div>

        <div class="content">
            
        </div>

        <footer>

        </footer>
        <%@include file="pages/popup.jsp" %>
        <script src="js/test.js" type="text/javascript"></script>
    </body>
</html>
