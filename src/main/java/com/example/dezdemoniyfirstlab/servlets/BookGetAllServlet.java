package com.example.dezdemoniyfirstlab.servlets;

import com.example.dezdemoniyfirstlab.models.Book;
import com.example.dezdemoniyfirstlab.services.BookService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/books/view")
public class BookGetAllServlet extends HelloServlet {
    @EJB
    private BookService bookService;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<Book> books = bookService.getAll();
        request.setAttribute("books", books);
        getServletContext().getRequestDispatcher("/books-view.jsp").forward(request, response);
    }

}
