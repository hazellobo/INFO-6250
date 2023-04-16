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
          <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <div class="sidenav">
            <a href="book.jsp">Add Books</a>
            <br>
            <a href="music.jsp">Add Music</a>
            <br>
            <a href="computer.jsp">Add Computer</a>
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
                [<a href="cart.jsp">View Cart</a>]
                [<a href="book.jsp">Go to Books Page</a>]
                [<a href="music.jsp">Go to Music Page</a>]
                [<a href="computer.jsp">Go to Computers Page</a>]
            </p>
        <br>
        </div>
    </body>
</html>
