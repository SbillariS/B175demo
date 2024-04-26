<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=2px solid>
<tbody>
      <tr>
      <th>Employee Id</th>
      <th>Employee Name</th>
      <th>Address</th>
      <th>Mobile No</th>
      <th>Age</th>
      <th>Salary</th>
      <th>Username</th>
      <th>Password</th>
      <th>Action</th>
      </tr>
      <c:forEach items="${data}" var="e">
      <tr>
      <td>${e.empid}</td>
      <td>${e.empname}</td>
      <td>${e.address}</td>
      <td>${e.mobno}</td>
      <td>${e.age}</td>
       <td>${e.salary}</td>
       <td>${e.username}</td>
       <td>${e.password}</td>
       <td><a href="delete?empid=${e.empid}">DELETE</a>||<a href="edit?empid=${e.empid}">Edit</a></td>
      </tr>
      </c:forEach>
</tbody>
</table>
<a href="paging?pageNo=0">Next</a>||<a href="paging?pageNo=1">1</a>||<a href="paging?pageNo=2">2</a>||<a href="paging?pageNo=3">3</a>||<a href="paging?pageNo=3">Previous</a>
</body>
</html>