<%-- 
    Document   : addMovie
    Created on : Oct 15, 2022, 2:49:06 AM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Movie</title>
    </head>
    <body bgcolor="#37E5FF">
        <h1> Please Enter the details below: </h1><br>
        <form action= "addmovie" method= "post">
            <label> Movie Title </label>
            <input type="text" name= "title" required><br/><br/>
            <label> Lead Actor </label>
            <input type="text" name= "actor" required><br/><br/>
            <label> Lead Actress  </label>
            <input type="text" name= "actress" required><br/><br/>
            <label> Genre  </label>
            <input type="text" name= "genre" required><br/><br/>
            <label> Year  </label>
            <input type="text" name= "year" pattern="[0-9]{4}" required><br/><br/>
            <input type='hidden' name='option' value='add'>
            <input align ="center" type="submit" value="Submit" >
        </form>
    </body>
</html>
