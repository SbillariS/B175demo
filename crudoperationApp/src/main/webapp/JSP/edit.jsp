<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
       
</style>
</head>
<body>
<form action="update">
<table>
<tbody>
        <tr><td>Employee Id-    <input type="hidden" name="empid" value="${emp.empid} "></td></tr>
        <tr><td>Employee name-  <input type="text" name="empname"  value="${emp.empname}"></td></tr>
        <tr><td>Employee address<input type="text" name="address" value="${emp.address}"></td></tr>
        <tr><td>Mobile No-      <input type="number" name="mobno" value="${emp.mobno}"></td></tr>
        <tr><td>Employee Age-   <input type="number" name="age" value="${emp.age}"></td></tr>
        <tr><td>Employee salary-<input type="text" name="salary" value="${emp.salary}"></td></tr>
        <tr><td>Username-       <input type="text" name="username" value="${emp.username}"></td></tr>
        <tr><td>Password-       <input type="text" name="password" value="${emp.password}"></td></tr>
        <tr><td><input type="submit" value="update"></td></tr>
</tbody>
</table>
</form>
</body>
</html>