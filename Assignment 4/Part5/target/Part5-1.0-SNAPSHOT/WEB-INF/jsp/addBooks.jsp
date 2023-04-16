<%-- 
    Document   : addBooks
    Created on : Oct 19, 2022, 4:46:23 PM
    Author     : hazel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Books</title>
    </head>
    <body  bgcolor="#FFFF37">
    <h1>Add Books</h1>
    <form action="addbook" method="post">
        <table border="1">
            <tr><th/>ISBN<th/>Book Title<th/>Authors<th/>Price</tr>
          <c:forEach var="i" begin="0" end="${count-1}">
            <tr>
            <td/><input type="text" name="isbn${i}"/>
            <td/><input type="text" name="title${i}"/>
            <td/><input type="text" name="authors${i}"/>
            <td/><input type="text" name="price${i}"/>
          </tr>
          </c:forEach>
        </table>
     <input type="submit" name="submit" value="Add Books">
     <input type="hidden" name="quantity" value="${count}">
    </form>
    </body>
</html>
