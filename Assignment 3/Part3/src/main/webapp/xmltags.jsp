<%-- 
    Document   : xmltags
    Created on : Oct 19, 2022, 2:29:14 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
<!-- Start Nav-->
        <ul class="nav">
        <li class="nav-item">
          <a class="nav-link " href="coretags.jsp">Core Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="formattingtags.jsp">Format Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="functiontags.jsp">Function Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="xmltags.jsp">XML Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="sqltags.jsp">SQL Tags</a>
        </li>
      </ul>
<!-- End Nav-->

<!-- Start JSTL XML tags -->
        <h1>JSTL XML Tags</h1>
        <ul>         
            <c:import var="bookdir" url="books.xml"/>  
            <x:parse xml="${bookdir}" var="output"/> 
            
            <li><h3>&lt;x:parse&gt; and &lt;x:out&gt; Tag</h3></li>
            <h4>Book Info:</h4>
                <b>Name:</b>:  
                <x:out select="$output/books/book[3]/name" /><br>  
                <b>Author</b>:  
                <x:out select="$output/books/book[3]/author" /><br>
                <b>Price</b>:  
                <x:out select="$output/books/book[3]/price" /><br> 
            
             
            <li><h3>&lt;x:choose&gt;, &lt;x:when&gt; and &lt;x:otherwise&gt; Tag</h3></li>
            <x:choose>  
                <x:when select="$output//book/author = 'John Doe'">  
                   Book is written by John Doe  
                </x:when>  
                <x:when select="$output//book/author = 'Jane Doe'">  
                   Book is written by Jane Doe  
                </x:when>  
                <x:otherwise>  
                   The author is unknown...  
                </x:otherwise>  
            </x:choose>  
                   
            
            <li><h3>&lt;x:transform&gt; Tag</h3></li>
            <c:import var="xml" url="books.xml" />  
            <c:import var="xsl" url="books.xsl" />  
            <x:transform xml="${xml}" xslt="${xsl}" /> 
        </ul>       
<!-- End JSTL XML tags -->
    </body>
</html>
