<%-- 
    Document   : homepage.jsp
    Created on : Oct 19, 2022, 3:35:10 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body bgcolor="#FDA6C6">
        <form action="addBooks.jsp" method="GET">
            <label><h1>How many books do you want to add?</h1></label>
            <input type="text" name="quantity" pattern="[0-9]" required>
            <input type="submit" value="Submit" >
        </form>
    </body>
</html>
