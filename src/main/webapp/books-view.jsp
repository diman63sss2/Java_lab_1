<%@ page import="java.util.List" %>
<%@ page import="com.example.dezdemoniyfirstlab.models.Book" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Details</title>
</head>
<body>
<h1>Book Details</h1>
<table>
    <tr>
        <th>ID</th>
        <th>UUID</th>
        <th>Content</th>
        <th>Is Deleted</th>
        <th>Creation Date</th>
        <th>Last Modified Date</th>
        <th>Author</th>
    </tr>
    <%
        List<Book> books = (List<Book>) request.getAttribute("books");
        if (books != null && !books.isEmpty()) {
            for (Book book : books) {
    %>
    <tr>
        <td><%= book.getId() %></td>
        <td><%= book.getUuid() %></td>
        <td><%= book.getContent() %></td>
        <td><%= book.getIsDeleted() %></td>
        <td><%= book.getCreationDate() %></td>
        <td><%= book.getLastModifiedDate() %></td>
        <td><%= book.getUser().getUsername() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="7">No books found.</td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>