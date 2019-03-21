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

@WebServlet("/condition")
public class ConditionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
          // 处理乱码
        request.setCharacterEncoding("utf-8");

        // 获取sex address参数
        String sex = request.getParameter("sex");
        String address = request.getParameter("address");

        // 交给service
        ContactService service = new ContactServiceImpl();

        List<Contact> contacts = service.conditionFind(sex, address);

        // 加到域中
        request.setAttribute("contacts",contacts);
        // 把需要回显的数据添加到 域中
        request.setAttribute("sex",sex);
        request.setAttribute("address",address);

        // 请求转发给ConditionList.jsp
        request.getRequestDispatcher("/ConditionList.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

    }
}
