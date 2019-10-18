<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
<c:if test="${empty emp}">
No records found
</c:if>


<c:if test="${not empty emp}">
records found with names:
    <c:forEach items="${emp}" var="emp">
       ${emp.name}
</c:forEach>
</c:if>
</html>