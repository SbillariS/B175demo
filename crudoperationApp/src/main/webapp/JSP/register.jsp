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
<form action="register">
<table>
<tbody>
        <tr><th>Registration Here</th></tr>
        <tr><td>Employee Id-    <input type="number" name="empid"></td></tr>
        <tr><td>Employee name-  <input type="text" name="empname"></td></tr>
        <tr><td>Employee address<input type="text" name="address"></td></tr>
        <tr><td>Mobile No-      <input type="number" name="mobno"></td></tr>
        <tr><td>Employee Age-   <input type="number" name="age"></td></tr>
        <tr><td>Employee salary-<input type="text" name="salary"></td></tr>
        <tr><td>Username-       <input type="text" name="username"></td></tr>
        <tr><td>Password-       <input type="text" name="password"></td></tr>
        <tr><td><input type="submit" value="Register"></td></tr>
</tbody>
</table>
</form>
</body>
</html>