<%@ page import="com.example.dezdemoniyfirstlab.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Details</title>
</head>
<body>
<h1>User Details</h1>
<%
    User user = (User) request.getAttribute("user");
    if (user != null) {
%>
<table>
    <tr>
        <th>ID</th>
        <td><%= user.getId() %></td>
    </tr>
    <tr>
        <th>UUID</th>
        <td><%= user.getUuid() %></td>
    </tr>
    <tr>
        <th>Username</th>
        <td><%= user.getUsername() %></td>
    </tr>
    <tr>
        <th>First Name</th>
        <td><%= user.getFirstname() %></td>
    </tr>
    <tr>
        <th>Last Name</th>
        <td><%= user.getLastname() %></td>
    </tr>
    <tr>
        <th>Email</th>
        <td><%= user.getEmail() %></td>
    </tr>
    <tr>
        <th>Registration Date</th>
        <td><%= user.getRegistrationDate() %></td>
    </tr>
    <tr>
        <th>Last Modified Date</th>
        <td><%= user.getLastModifiedDate() %></td>
    </tr>
    <tr>
        <th>Role</th>
        <td><%= user.getRole() %></td>
    </tr>
</table>
<%
} else {
%>
<p>No user found.</p>
<%
    }
%>
</body>
</html>