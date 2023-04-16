<%-- 
    Document   : ViewMovieSuccess
    Created on : Oct 15, 2022, 2:55:05 AM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Found</title>
    </head>
    <body bgcolor="#37FF81">
        <h3>You searched for ${requestScope.filter}:"${requestScope.keyword}"</h3>
    <table border = "1" width="60%">
    <thead>
    <th>Movie Title</th>
    <th>Lead Actor</th>
    <th>Lead Actress</th>
    <th>Genre</th>
    <th>Year</th>

    </thead>
    <tbody>
    <c:forEach var="movie" items="${requestScope.movieList}">
        <tr>
            <td><c:out value="${movie.getTitle()}" /></td>
            <td><c:out value="${movie.getActor()}" /></td>
            <td><c:out value="${movie.getActress()}" /></td>
            <td><c:out value="${movie.getGenre()}" /></td>
            <td><c:out value="${movie.getYear()}" /></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br/>
<a href="homepage.jsp"> Click here to go to the main page </a>
</body>
</html>
