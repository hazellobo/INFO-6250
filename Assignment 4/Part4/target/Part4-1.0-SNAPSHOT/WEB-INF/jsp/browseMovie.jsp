<%-- 
    Document   : browseMovie
    Created on : Oct 15, 2022, 2:52:05 AM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Movie</title>
    </head>
    <body bgcolor="#FFFF37">
    <h1> Searching Movies</h1><br>
    <form action= "searchmovie"  method= "post">
        <label> Keyword </label>
        <input type="text" name= "searchtext" required><br /><br/>
        <input type="radio" name= "searchoption" value ="title" required>Search By Title <br><br/>
        <input type="radio" name= "searchoption" value ="actor">Search By Actor <br><br/>
        <input type="radio" name= "searchoption" value ="actress">Search By Actress <br><br/>
        <input type='hidden' name='option' value='browse'>
        <input align ="center" type= "submit" value= "Search Movies" >
    </form>
    </body>
</html>
