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

@WebServlet(value = "/user/view")
public class UserGetOneServlet extends HttpServlet {


    @EJB
    private UserService userService;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println(request.getParameter("id"));
        User user = userService.getById(Long.parseLong(request.getParameter("id")));
        request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/user-view.jsp").forward(request, response);
    }
}
