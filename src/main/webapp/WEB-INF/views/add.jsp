<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>gomaa</title>
</head>
<body>
<form  method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">username </label>
    <input type="text" class="form-control" name="name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">date</label>
    <input type="text" class="form-control"  name="date" required>
  </div> 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
${error }

</body>
</html>