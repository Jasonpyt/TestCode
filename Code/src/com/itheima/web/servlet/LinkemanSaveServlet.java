package com.itheima.web.servlet;

import com.itheima.domain.Linkman;
import com.itheima.service.LinkmanService;
import jdk.internal.dynalink.linker.LinkerServices;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/linkmanSave")
public class LinkemanSaveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            Linkman linkman = new Linkman();
            BeanUtils.populate(linkman, request.getParameterMap());

            LinkmanService service = new LinkmanService();
            service.save(linkman);
            response.getWriter().print("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
