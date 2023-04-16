<%-- 
    Document   : homepage
    Created on : Oct 15, 2022, 2:42:18 AM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
    </head>
    <body bgcolor="#FDA6C6">
        <h1>Welcome to our Movie Store</h1>
        <h3>Please make your selection below</h3>
        <form action="dropdownselection" method="POST">
            <select name="option">
                <option value="Browse">Browse Movies</option>
                <option value="Add">Add New Movie to Database</option>
            </select>
            <input type="submit" value="Send" >
        </form>
    </body>
</html>
