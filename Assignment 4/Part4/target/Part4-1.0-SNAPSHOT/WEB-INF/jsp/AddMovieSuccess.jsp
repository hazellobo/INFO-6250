<%-- 
    Document   : AddMovieSuccess
    Created on : Oct 15, 2022, 2:54:55 AM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Added</title>
    </head>
    <body bgcolor="#E678E6">
       <h1> 1 movie added successfully </h1><br><br/>
    <table border = "1" width="60%">
    <thead>
    <th>Title</th>
    <th>Actor</th>
    <th>Actress</th>
    <th>Genre</th>
    <th>Year</th>

    </thead>
    <tbody>
    <c:set var="movie" value="${movie}"></c:set>
    <tr>
        <td><c:out value="${movie.getTitle()}" /></td>
        <td><c:out value="${movie.getActor()}" /></td>
        <td><c:out value="${movie.getActress()}" /></td>
        <td><c:out value="${movie.getGenre()}" /></td>
        <td><c:out value="${movie.getYear()}" /></td>

    </tr>

    </tbody>
</table>
<br><br/>
<a href="homepage"> Click here to go to the home page </a>
</body>
</html>
