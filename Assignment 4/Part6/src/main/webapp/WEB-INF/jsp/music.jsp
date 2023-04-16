<%-- 
    Document   : music
    Created on : Oct 19, 2022, 8:04:34 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
        <title>Music</title>
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
        <div>Shop for CDs</div>
        <hr/>
         <div>
            <p align="right">[<a href="cart">View Cart</a>]</p>
        </div>
        <div>
            <form action="addToCart" method="post">
                <input type="checkbox" name="music" value="I'm Going to Tell You a Secret by Madonna[$26.99]"/>
                I'm Going to Tell You a Secret by Madonna[$26.99]<br/>
                <input type="checkbox" name="music" value="Baby One More Time by Britney Spears[$10.95]"/>
                Baby One More Time by Britney Spears[$10.95]<br/>
                <input type="checkbox" name="music" value="Justified by Justin Timberlake[$9.97]"/>
                Justified by Justin Timberlake[$9.97]<br/>
                <input type="checkbox" name="music" value="Loose by Nelly Furtado[$13.98]"/>
                Loose by Nelly Furtado[$13.98]<br/>
                <input type="checkbox" name="music" value="Gold Digger by Kanye West[$27.99]"/>
                Gold Digger by Kanye West[$27.99]<br/>
                <input type="submit" name="submit" value="Add to Cart"/><br/>
            </form>
        </div>
        </div>
    </body>
</html>
