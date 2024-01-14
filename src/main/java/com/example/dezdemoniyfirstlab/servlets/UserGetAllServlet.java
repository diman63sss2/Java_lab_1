package com.example.dezdemoniyfirstlab.servlets;

import com.example.dezdemoniyfirstlab.models.User;
import com.example.dezdemoniyfirstlab.services.UserService;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(value = "/users/view")
public class UserGetAllServlet extends HttpServlet {
    @EJB
    private UserService userService;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        List<User> users = userService.getAll();
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/users-view.jsp").forward(request, response);
    }
}
