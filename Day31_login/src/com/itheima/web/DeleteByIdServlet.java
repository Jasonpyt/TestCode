package com.itheima.web;

import com.itheima.service.ContactService;
import com.itheima.service.impl.ContactServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteByIdServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
       /*
          获取到传递来的id
        */
        String id = request.getParameter("id");

        // 将id交给service  完成删除
        ContactService service = new ContactServiceImpl();

        service.deleteById(id);

        // 删除之后呢？  需要重新查询一遍所有的用户信息
        //要去找servlet
        response.sendRedirect(request.getContextPath()+"/findAll");
    }
}
