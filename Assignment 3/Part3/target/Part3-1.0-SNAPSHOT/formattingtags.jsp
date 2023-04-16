<%-- 
    Document   : formattingtags
    Created on : Oct 14, 2022, 2:27:49 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %> 
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
          <a class="nav-link active" href="formattingtags.jsp">Format Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="functiontags.jsp">Function Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="xmltags.jsp">XML Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="sqltags.jsp">SQL Tags</a>
        </li>
      </ul>
<!-- End Nav-->
        
        <!-- Start JSTL Formatting tags -->
        <h1>JSTL Formatting Tags</h1>
        <ul>
            <li><h3>&lt;fmt:parseNumber&gt; Tag</h3></li>
            <c:set var="marks" value="98.34" />  

            <fmt:parseNumber var="j" type="number" value="${marks}" />  
            <p><i>Marks:</i>  <c:out value="${j}" /></p>  

            <fmt:parseNumber var="j" integerOnly="true" type="number" value="${marks}" />  
            <p><i>Marks:</i>  <c:out value="${j}" /></p>  
         
            <li><h3>&lt;fmt:parseDate&gt; Tag</h3></li>
            <c:set var="date" value="18-09-1974" />  
            <p> Date before parsing:<c:out value="${date}" /></p>
            <fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
            <p> Date after parsing: <c:out value="${parsedDate}" /></p> 
            
            
            <li><h3>&lt;fmt:timeZone&gt; Tag</h3></li>
            <h4>US Timezones</h4>
            <c:set var="currentDate" value="<%=new java.util.Date()%>"/>
	    <table border="2">
	     <c:forEach var="timeZone" items="<%=java.util.TimeZone.getAvailableIDs()%>">
                          <c:if test="${fn:contains(timeZone, 'US/')}">   
			  <tr>
			    <td>
			      <c:out value="${timeZone}" />
			    </td>
			    <td> 
			      <fmt:timeZone value="${timeZone}">
			        <fmt:formatDate 
                                   value="${currentDate}" type="both" />
			      </fmt:timeZone>
			    </td>
			  </tr>
                          </c:if>
		   </c:forEach>
		</table> 
        </ul> 
<!-- End JSTL Formatting tags -->    
    </body>
</html>
