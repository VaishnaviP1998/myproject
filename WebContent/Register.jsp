<%@ page language="java" contentType="text/html" import="java.util.*"%>
<%@include file="CommonHeader.jsp" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/>
<form action=" RegisterController"method="post">
<table align="left"cellspacing="2">
<tr bgcolor="gray"><td colspan="2"><h2><font face="Monotype Corsiva" color="blue"size="15">Sign in here:-</font></h2></td></tr>&nbsp;&nbsp;&nbsp;

<tr bgcolor="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva"color="red"size="15">${errorInfo}</font>
</h2>
</td>
</tr>

<tr><td>Login</td><td><input type="text"name="login"></td></tr>
<tr><td>Password</td><td><input type="password"name="password"></td></tr>
<tr><td>CustomerName</td><td><input type="text"name="customerName"></td></tr>
<tr><td>EmailId</td><td><input type="email"name="EmailId"></td></tr>
<tr><td>Mobile</td><td><input type="text"name="mobileNo" ></td></tr>
<tr><td>Adress</td><td><textarea cols="30"rows="5"name="adrress"></textarea></td></tr>
<td>Country</td>
<td>
<select name="country">
    <option value="Select country">Select Country</option>
    <option value="India">India</option>
    <option value="USA">USA</option>
    <option value="Srilanka">Srilanka</option>
</select>
</td>
</tr>

<tr bgcolor="gray">
<td colspan="2"><center>
<input type="submit" value="Sign Up"/>
</center>
</td>
</tr>
</table>
</form>
</body>
</html>