<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Авторизация</title>
        
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        <%="Hello, "%>
        <h2>
            <%=request.getParameter("login") + "!"%>
        </h2>
    </body>
</html>
