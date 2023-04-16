<%-- 
    Document   : jstl
    Created on : Oct 14, 2022, 2:30:13 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
          <a class="nav-link active" href="coretags.jsp">Core Tags</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="formattingtags.jsp">Format Tags</a>
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


<!-- Start JSTL COre tags -->
        <h1>JSTL Core Tags</h1>
        <ul>
            <li><h3>&lt;c:out&gt; Tag</h3></li>
                <c:out value="This is a c:out JSTL core tag example."/><br/>
                Sum of 15 and 30 = <c:out value="${15+30}"/><br/><br/>

                <c:out value="${'<h6>This is a <c:out> escape XML test </h6>'}"/>
        
            <li><h3>&lt;c:catch&gt; Tag</h3></li>
                <c:catch var ="exception">
   			<% 
                            int[] num = new int[3];
                            int k= num[4];
                        %>
		</c:catch>
 
		<c:if test = "${exception != null}">
		   Occurred exception is : ${exception}
		</c:if>
                   
            <li><h3>&lt;c:set&gt; and &lt;c:if&gt; Tag</h3></li>
                <c:set var="num" value="100"/>
		<c:if test="${num > 0}">
			Number = <c:out value="${num}"/>
		</c:if>
                        
            <li><h3>&lt;c:remove&gt; Tag</h3></li>            
                <c:set var="price" value="100"/>
                Before removing the variable value:<c:out value="${price}"/><br/>
                <c:remove var="website"/>
                After removing the variable value:<c:out value="${price}"/>
                
            <li><h3>&lt;c:choose&gt;,&lt;c:when&gt; and &lt;c:otherwise&gt; Tag</h3></li>
                <c:set var="val" scope="session" value="${1123}"/>  
                <p>The selected number : <c:out value="${val}"/></p>  
                <c:choose>  
                    <c:when test="${val%2==0}">  
                       Number is Even.  
                    </c:when>  
                    <c:otherwise>  
                       Number is Odd.  
                    </c:otherwise>  
                </c:choose>  
        </ul>
<!-- End JSTL COre tags --> 

    </body>
</html>
