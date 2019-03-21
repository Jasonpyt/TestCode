package com.itheima.web;

import com.itheima.domain.Contact;
import com.itheima.service.ContactService;
import com.itheima.service.impl.ContactServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findAll")
public class FindAllServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        // 去 数据库中 查询 所有的用户信息
        ContactService service = new ContactServiceImpl();

        List<Contact> list = service.findAll();

        // 将集合数据存储到域中
        request.setAttribute("contactlist",list);

        // 这次请求转发给一个JSP
        request.getRequestDispatcher("/list.jsp").forward(request,response);

    }
}
