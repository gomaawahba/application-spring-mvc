<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>updata</title>
</head>
<body>

<form  method="post">
 <input type="text"  name="id" value="${student2.id}" required>
  <div class="form-group">
    <label for="exampleInputEmail1">Name </label>
    <input type="text" class="form-control" name="name" value="${student2.getName()}" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Date</label>
    <input type="text" class="form-control"  name="date" value="${student2.getName()}" required >
  </div> 
    <div class="form-group">
    <label for="exampleInputPassword1">Active</label>
    <input type="text" class="form-control"  name="isactive" value="${student2.getIsActive()}" required>
  </div> 
  <button type="submit" class="btn btn-primary">Submit</button>

</body>
</html>