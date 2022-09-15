<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AllContact</title>
</head>
<body>
<table cellpadding="20px" align="center" border="">
<tr>
<th>cid</th>
<th>cname</th>
<th>phonenumber</th>
<th>delete</th>
<th>update</th>
</tr>

<c:forEach var="contact"  items="${contact }">
<tr>
<td>${contact.getId()}</td>
<td>${contact.getName()}</td>
<td>${contact.getPhonenumber()}</td>
<td><a href="delete">delete</a></td>
<td><a href="update">update</a></td>
</tr>
</c:forEach>


</table>
<a href="Menu.jsp">home</a>
</body>
</html>