<%-- 
    Document   : homepage
    Created on : Oct 26, 2022, 6:24:46 AM
    Author     : hazel
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
    <h1>Singleton Scope Example</h1>
    <ul>
        <li><b>Utility Message:</b>${requestScope.message}</li>
        <li><b>Object ID:</b>${requestScope.objectID}</li>
    </ul>
</body>
</html>
