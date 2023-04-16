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
    <title>No Result</title>
</head>
<body bgcolor="#E9E9D8">
    
<h1>No Movie found with this search</h1><br/><br/>
<h3>You searched for ${requestScope.filter}:"${requestScope.keyword}"</h3>
<a href="homepage"> Click here to go to the home page </a>
</body>
</html>
