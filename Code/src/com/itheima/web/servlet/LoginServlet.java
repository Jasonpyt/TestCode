package com.itheima.web.servlet;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");

       String username = request.getParameter("username");
       String password = request.getParameter("password");

        UserService userService = new UserService();

       User user = null;

        try {
            User login = userService.login(username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (user == null){
            request.setAttribute("msg","用户名和密码不匹配");
            return;
        }else{
           request.getSession().setAttribute("user",user);
           response.sendRedirect(request.getContextPath());
        }


    }
}
