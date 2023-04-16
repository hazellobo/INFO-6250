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
<form action="book" method="post">
<%
String quantity = request.getParameter("quantity");
int count = Integer.valueOf(quantity);
%>
    <table border="0.5">
        <tr/><th/>ISBN<th/>Book Title<th/>Authors<th/>Price
        <%for (int i = 0; i < count; i++) {%>
        <tr/>
        <td/><input type="text" name="isbn<%=String.valueOf(i)%>"/>
        <td/><input type="text" name="title<%=String.valueOf(i)%>"/>
        <td/><input type="text" name="authors<%=String.valueOf(i)%>"/>
        <td/><input type="text" name="price<%=String.valueOf(i)%>"/>
        <%}%>
        <tr/><td/>
        <input type="submit" name="submit" value="Add Books">
        <input type="hidden" name="quantity" value="<%=quantity%>">
    </table>
</form>
    </body>
</html>
