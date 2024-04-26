<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
       table{
  border-collapse:collapse;
  text-align:center;
  margin:auto;
   border: 2px solid;
   width:400px;
   height:350px;
       }
       th{
         color: blue;      
          }
</style>
</head>
<body>
<form action="log">
<table>
<tbody>
        <tr><th>Login Page</th></tr>
        <tr><td>username : <input type="text" name="username"></td></tr>
        <tr><td>password : <input type="text" name="password"></td></tr>
        <tr><td><input type="submit" value="login"></td></tr>
        <tr><td>Create account?<a href="openreg">Register Here</a></td></tr>
</tbody>
</table>
</form>
</body>
</html>