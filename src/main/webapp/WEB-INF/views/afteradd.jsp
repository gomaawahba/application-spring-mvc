<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Student page</title>
</head>
<body>



<!--
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
  <c:forEach items="${after }" var ="stud">  
    <tr>
      <th scope="row">${stud.id }</th>
      <td>${stud.name }</td>
      <td>${stud.date }</td>
      <td>${stud.isActive }</td>
    </tr>
<br>

</c:forEach> -->


  </tbody>
</table>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">name</th>
      <th scope="col">date</th>
      <th scope="col">Active</th>
      <th scope="col">Delete</th>
      <th scope="col">Edit</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${after }" var ="stud">  
    <tr>
      <th scope="row">${stud.id }</th>
      <td>${stud.name }</td>
      <td>${stud.date }</td>
      <td>${stud.isActive }</td>
      <td><a href="delet?id=${stud.id }" class="btn btn-danger">Delete</a></td>
      <td><a href="edit?id=${stud.id }" class="btn btn-success">Edit</a></td>
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