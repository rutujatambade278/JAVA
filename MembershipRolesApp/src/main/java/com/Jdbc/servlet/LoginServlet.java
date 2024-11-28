package com.Jdbc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Jdbc.dao.UserDAO;
import com.Jdbc.dao.model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  
    private UserDAO userdao = new UserDAO(); 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the username or password is empty
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            response.sendRedirect("error.jsp");
            return;
        }

        // Validate the user credentials
        User user = userdao.validateUser(username, password);
        
        if (user != null) {
            // Store the user in session
            request.getSession().setAttribute("user", user);
            
            // Redirect based on role
            if ("Admin".equals(user.getRole())) {
                response.sendRedirect("admin.jsp");
            } else {
                response.sendRedirect("member.jsp");
            }
        } else {
            // If invalid credentials, redirect to error page
            response.sendRedirect("error.jsp");
        }
    }
}
