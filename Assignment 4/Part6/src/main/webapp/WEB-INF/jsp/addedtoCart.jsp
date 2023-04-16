<%-- 
    Document   : addedtoCart
    Created on : Oct 19, 2022, 8:08:46 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    </head>
    <body>
        <div class="sidenav">
            <a href="book">Add Books</a>
            <br>
            <a href="music">Add Music</a>
            <br>
            <a href="computer">Add Computer</a>
        </div>
        
        <div class="main">
            <h3>My Cart</h3>
            <c:set var="addedItems" value="${sessionScope.addedCartItems}"/>
            <c:choose >
                <c:when test="${addedItems != null}">
                    <h3>The following items has been added to your shopping cart successfully</h3>
                    <c:forEach var="item" items="${addedItems}">
                        <p>${item}</p>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <h1>Please Add Items</h1>
                </c:otherwise>
            </c:choose>
            <p>
                [<a href="cart">View Cart</a>]
                [<a href="book">Go to Books Page</a>]
                [<a href="music">Go to Music Page</a>]
                [<a href="computer">Go to Computers Page</a>]
            </p>
        <br>
        </div>
    </body>
</html>
