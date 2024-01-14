<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="${pageContext.request.contextPath}/user/view?id=1">particular user</a>
<a href="${pageContext.request.contextPath}/users/view">all users</a>
<a href="${pageContext.request.contextPath}/book/view?id=1">particular book</a>
<a href="${pageContext.request.contextPath}/books/view">all book</a>
<a href="${pageContext.request.contextPath}/books/get-by-user?id=1">author books</a>

</body>
</html>