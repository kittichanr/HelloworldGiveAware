<%-- 
    Document   : index
    Created on : Dec 10, 2017, 3:00:19 PM
    Author     : yeen
--%>

<%@page import="javax.websocket.OnOpen"%>
<%@page import="java.util.List"%>
<%@page import="model.HelloWorld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HelloWorld</title>
    </head>
    <body>
        <% String message = (String) request.getAttribute("hd");
        %>
        <%
            HelloWorld hd = new HelloWorld();
            message = hd.showMessage();
        %>
        <h1><%=message%></h1>
    </body>
</html>
