<%-- 
    Document   : book
    Created on : Oct 19, 2022, 8:05:47 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book</title>
        <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    </head>
    <body>
        <div class="sidenav">
            <a href="book">Add Books</a>
            <br/>
            <a href="music">Add Music</a>
            <br/>
            <a href="computer">Add Computer</a>
            <br/>
        </div>
        <div class="main">
             <div>Shop for Books</div>
            <hr/>
            <div><p align="right">[<a href="cart">View Cart</a>]</p></div>
            <div>
            <form action="addToCart" method="post">
                <input type="checkbox" name="books" value="Java Servlet Programming[$29.95]"/>
                Java Servlet Programming[$29.95]<br/>
                <input type="checkbox" name="books" value="Oracle Database Programming[$48.95]"/>
                Oracle Database Programming[$48.95]<br/>
                <input type="checkbox" name="books" value="System Analysis and Design With UML[$14.95]"/>
                System Analysis and Design With UML[$14.95]<br/>
                <input type="checkbox" name="books" value="Object Oriented Software Engineering[$35.99]"/>
                Object Oriented Software Engineering[$35.99]<br/>
                <input type="checkbox" name="books" value="Java Web Services[$27.99]"/>
                Java Web Services[$27.99]<br/>
                <input type="submit" name="submit" value="Add to Cart"/><br/>
            </form>
        </div>
    </div>
    </body>
</html>
