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

@WebServlet("/findByPage")
public class FindByPageServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        // 默认 查询第一页
        int pageNum=1;

          // 获取地址上的页码
        String pageNumber = request.getParameter("pageNumber");

        if(pageNumber!=null){
           pageNum = Integer.parseInt(pageNumber);
        }
        //设置每页显示多少条
        int pageSize = 5;

        // 需要 service支持
        ContactService service = new ContactServiceImpl();

        List<Contact> contacts = service.findByPage(pageNum, pageSize);

        // 将数据请求转发到 jsp中
        request.setAttribute("contacts",contacts);
        //




        request.getRequestDispatcher("/page.jsp").forward(request,response);
    }
}
