<%-- 
    Document   : functiontags
    Created on : Oct 19, 2022, 2:26:09 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
          <a class="nav-link" href="coretags.jsp">Core Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="formattingtags.jsp">Format Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="functiontags.jsp">Function Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="xmltags.jsp">XML Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="sqltags.jsp">SQL Tags</a>
        </li>
      </ul>
<!-- End Nav-->

        
        <!-- Start JSTL Function tags -->        
        <h1>JSTL Function Tags</h1>
        <ul>
            
            <c:set var="str1" value="Masters in Information Systems"/>  
            <c:set var="str2" value="<web-app>String 2</web-app>"/>  
            
            
            <li><h3>fn:contains() Function</h3></li>
            <c:if test="${fn:contains(str1, 'Information')}">  
               <p>Found Information substring<p>  
            </c:if>  

            <c:if test="${fn:contains(str1, 'INFORM')}">  
               <p>Found INFORM substring<p>  
            </c:if>  
              
                   
            <li><h3>fn:escapeXml() Function</h3></li>   
           
            <p>With escapeXml() Function:</p>  
            <p>String 1 : ${fn:escapeXml(str1)}</p>  
            <p>String 2 : ${fn:escapeXml(str2)}</p>  

            <p>Without escapeXml() Function:</p>  
            <p>String 1 : ${str1}</p>  
            <p>String 2 : ${str2}</p>  
            

            <li><h3>fn:length() and fn:trim() Function</h3></li>
            <!-- Before trim -->
            <c:set var="str3" value="Hazel      Lobo   "/>
            <p>Length of String before trim: ${fn:length(str3)} </p>
            
            <!-- After trim -->
            <c:set var="str4" value="${fn:trim(str3)}"/>
            <p>Length of String after trim: ${fn:length(str4)}</p>
            <p>Final String value:${str4} </p>
            

            <li><h3>fn:replace() Function</h3></li>
            <c:set var="Greeting" value="Hello Miss"/>  
            <c:set var="string" value="Jane Doe"/>  
            ${fn:replace(Greeting, "Miss", "Mister")}  
            ${fn:replace(string, "Jane", "John")}  
        </ul>
<!-- End JSTL Function tags -->

    </body>
</html>
