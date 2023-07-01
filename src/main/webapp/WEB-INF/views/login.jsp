<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>gomaa</title>
</head>
<body>
<form method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">username </label>
    <input type="text" class="form-control" name="name">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control"  name="password" >
  </div> 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<div class="alert alert-warning" role="alert">
  ${error }
</div>
</body>
</html>