<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SHOPPING CART WEB SITE</title>
</head>
<body>
     <h1><center> Shopping cart</center></h1>
  <h2> <center>${msg}</center></h2>
     <hr>
     <a href="login">Login</a> <br>
     <a href="logout">LogOut</a> <br>
     <a href="register">Register</a>
     <br>
    
     <c:if test="${isUserClickedLogin==true}">
     <jsp:include page="Login.jsp"></jsp:include><br>
    </c:if>
   
      <c:if test="${isUserClickedRegister==true}">
     <jsp:include page="Registration.jsp"></jsp:include>
     </c:if>
</body>
</html>