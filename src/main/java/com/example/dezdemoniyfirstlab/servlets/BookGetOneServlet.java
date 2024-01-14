package com.example.dezdemoniyfirstlab.servlets;

import com.example.dezdemoniyfirstlab.models.Book;
import com.example.dezdemoniyfirstlab.models.User;
import com.example.dezdemoniyfirstlab.services.BookService;
import com.example.dezdemoniyfirstlab.services.UserService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/book/view")
public class BookGetOneServlet extends HttpServlet {
    @EJB
    private BookService bookService;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println(request.getParameter("id"));
        Book book = bookService.getById(Long.parseLong(request.getParameter("id")));
        request.setAttribute("book", book);
        getServletContext().getRequestDispatcher("/book-view.jsp").forward(request, response);
    }
}
