<%-- 
    Document   : newjsp
    Created on : Oct 7, 2022, 9:30:29 PM
    Author     : hazel
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <div align="center">
        <h1>Login</h1>
    <form action="j_security_check" method="POST">
        <div class="form-group">
            User name: <INPUT TYPE="TEXT" NAME="j_username" required><br/><br/>
            Password: <INPUT TYPE="PASSWORD" NAME="j_password" required>
        </div>
        <INPUT TYPE="SUBMIT" class="btn btn-primary" VALUE="Log In">
    </form>
    </div>
</body>
</html>
