<%-- 
    Document   : laptops
    Created on : Oct 19, 2022, 8:05:12 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div>Shop for Laptops</div>
        <hr/>
         <div>
               <p align="right">[<a href="cart.jsp">View Cart</a>]</p>
         </div>
        <div>
            <form action="shop" method="post">
                <input type="checkbox" name="computers" value="Apple MacBook Pro with 13.3' Display[$1299.99]"/>
                Apple MacBook Pro with 13.3' Display[$1299.99]<br/>
                <input type="checkbox" name="computers" value="Asus Laptop with Centrino 2 Black[$949.95]"/>
                Asus Laptop with Centrino 2 Black[$949.95]<br/>
                <input type="checkbox" name="computers" value="HP Pavlion Laptop with Centrino 2 DV7[$1199.95]"/>
                HP Pavlion Laptop with Centrino 2 DV7[$1199.95]<br/>
                <input type="checkbox" name="computers" value="Toshiba Satellite Laptop with Centrino 2 - Copper[$899.99]"/>
                Toshiba Satellite Laptop with Centrino 2 - Copper[$899.99]<br/>
                <input type="checkbox" name="computers" value="Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink[$779.99]"/>
                Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink[$779.99]<br/>
                <input type="submit" name="submit" value="Add to Cart"/><br/>
            </form>
        </div>
    </div>
    </body>
</html>
