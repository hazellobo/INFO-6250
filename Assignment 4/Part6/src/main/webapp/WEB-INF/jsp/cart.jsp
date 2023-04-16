<%-- 
    Document   : cart
    Created on : Oct 19, 2022, 8:06:04 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
        <title>My Cart</title>
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
         <c:set var="cart" value="${sessionScope.cart}" />
                    <c:if test="${not empty cart}">
                        <div align="center">
                            <form action="updateToCart" method="POST">
                            <table border="0.5" align="center">
                            <c:forEach var="item" items="${cart.cart}">
                                <tr>
                                    <td>
                                        <p>${item.name}</p>
                                    </td>
                                    <td>
                                        <input type="number" name="${item.name}" value="${item.quantity}">
                                    </td>
                                </tr>
                            </c:forEach>
                            </table>

                            <input type="submit" name="Submit" value="Submit">
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${empty cart}">
                        <c:out value="Your cart is empty!"/>
                    </c:if>
                
                
           
    </div>
    </body>
</html>
