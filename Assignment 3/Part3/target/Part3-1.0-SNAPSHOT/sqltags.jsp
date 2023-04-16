<%-- 
    Document   : sqltags
    Created on : Oct 19, 2022, 2:29:24 PM
    Author     : hazel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
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
          <a class="nav-link" href="coretags.jsp">Core Tags</a>
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
          <a class="nav-link active" href="sqltags.jsp">SQL Tags</a>
        </li>
      </ul>
<!-- End Nav-->
        
<!-- Start JSTL SQL tags -->
        <h1>JSTL SQL Tags</h1>
        <ul>
        <li><h3>&lt;sql:setDataSource&gt; and &lt;sql:query&gt; Tag</h3></li>
        
        <h5>Person Table</h5>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/mydb"  user="root"  password="root"/>  
        
        <sql:query dataSource="${db}" var="rs">  
        SELECT * from person;  
        </sql:query>  

        <table border="2">  
        <tr>  
            <th>SSN</th>  
            <th>First Name</th>  
            <th>Last Name</th>  
            <th>Age</th>  
        </tr>  
        <c:forEach var="table" items="${rs.rows}">  
        <tr>  
            <td><c:out value="${table.ssn}"/></td>  
            <td><c:out value="${table.firstname}"/></td>  
            <td><c:out value="${table.lastname}"/></td>  
            <td><c:out value="${table.age}"/></td>  
        </tr>  
        </c:forEach>  
        </table>  
        
        <li><h3>&lt;sql:update&gt; Tag</h3></li>
        <h5>Person Table after insertion</h5>
        <sql:update dataSource="${db}" var="count">  
        INSERT INTO Person VALUES ('152240987','Hazel', 'Lobo', '25');  
        </sql:update> 
        
        <sql:query dataSource="${db}" var="rs">  
        SELECT * from person;  
        </sql:query>  
        <table border="2">  
        <tr>  
            <th>SSN</th>  
            <th>First Name</th>  
            <th>Last Name</th>  
            <th>Age</th>  
        </tr>  
        <c:forEach var="table" items="${rs.rows}">  
        <tr>  
            <td><c:out value="${table.ssn}"/></td>  
            <td><c:out value="${table.firstname}"/></td>  
            <td><c:out value="${table.lastname}"/></td>  
            <td><c:out value="${table.age}"/></td>  
        </tr>  
        </c:forEach>  
        </table>
        
        <li><h3>&lt;sql:param&gt; Tag</h3></li>
        <h5>Person Table after deletion of specific record using param tag</h5>
        <c:set var="id" value="Hazel"/>  
        <sql:update dataSource="${db}" var="count">  
        DELETE FROM person WHERE firstname = ?  
         <sql:param value="${id}" />  
        </sql:update>  
        
        <sql:query dataSource="${db}" var="rs">  
        SELECT * from person;  
        </sql:query>  
        <table border="2">  
        <tr>  
            <th>SSN</th>  
            <th>First Name</th>  
            <th>Last Name</th>  
            <th>Age</th>  
        </tr>  
        <c:forEach var="table" items="${rs.rows}">  
        <tr>  
            <td><c:out value="${table.ssn}"/></td>  
            <td><c:out value="${table.firstname}"/></td>  
            <td><c:out value="${table.lastname}"/></td>  
            <td><c:out value="${table.age}"/></td>  
        </tr>  
        </c:forEach>  
        </table>
        
        </ul>
<!-- End JSTL SQL tags --> 
    </body>
</html>
