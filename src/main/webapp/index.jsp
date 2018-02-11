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
        
        <h1>${helloWorld.message}</h1>

    </body>
</html>
