<!-- header -->
<%@include file="includes/header.jspf" %>

<

!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Student page</title>
</head> -->
<body>
<h1>Hello ${name }</h1>
<div class="container">
${students }
</div>
<br>
<br>
<br>
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">name</th>
      <th scope="col">date</th>
      <th scope="col">active</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${students }" var ="stud">  
    <tr>
      <th scope="row">${stud.id }</th>
      <td>${stud.name }</td>
      <td>${stud.date }</td>
      <td>${stud.isActive }</td>
    </tr>
<br>
</c:forEach>


  </tbody>
</table>
<div class="container">
<a href="add" class="btn btn-primary">add student</a>

</div>

</body>
</html>