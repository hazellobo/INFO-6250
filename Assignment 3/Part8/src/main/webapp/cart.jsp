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
        <link rel="stylesheet" href="styles.css">
        <title>JSP Page</title>
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
         <c:set var="cart" value="${sessionScope.cart}" />
            <form action="shop" method="get">
                <table border="0.5" align="center">
                    <c:if test="${cart !=null}">
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
                    </c:if>
                </table>
                <div align="center">
                    <input type="submit" name="Submit" value="Submit">
                </div>
            </form>
    </div>
    </body>
</html>
