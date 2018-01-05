<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<center>
 <h2>Signup Details</h2>

<table>
<tr>
<td>Login Name</td>
<td><input type = "text" name = "newName"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type = "password" name = "newPassword"/></td>
</tr>
<tr>
<td>
<form method="post" action="/SpringPocXml/helloAgain" >
<input type="Submit" value="Submit"></form>
</td>

<td>
<form action="/SpringPocXml/" method="post">
<input type="Submit" value="Clear">
</form>
</td>
</tr>
</table>

</center>
</body>
</html>