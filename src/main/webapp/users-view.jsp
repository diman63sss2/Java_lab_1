%@ page import="java.util.List" %>
<%@ page import="com.example.dezdemoniyfirstlab.models.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Users Details</title>
</head>
<body>
<h1>All Users Details</h1>
<%
    List<User> users = (List<User>) request.getAttribute("users");
    if (users != null && !users.isEmpty()) {
%>
<table>
    <tr>
        <th>ID</th>
        <th>UUID</th>
        <th>Username</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Registration Date</th>
        <th>Last Modified Date</th>
        <th>Role</th>
    </tr>
    <% for (User user : users) { %>
    <tr>
        <td><%= user.getId() %></td>
        <td><%= user.getUuid() %></td>
        <td><%= user.getUsername() %></td>
        <td><%= user.getFirstname() %></td>
        <td><%= user.getLastname() %></td>
        <td><%= user.getEmail() %></td>
        <td><%= user.getRegistrationDate() %></td>
        <td><%= user.getLastModifiedDate() %></td>
        <td><%= user.getRole() %></td>
    </tr>
    <% } %>
</table>
<%
} else {
%>
<p>No users found.</p>
<%
    }
%>
</body>
</html>