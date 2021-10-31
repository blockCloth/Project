package com.jxgmxy.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author dai
 * @create 2021-10-2021/10/28  17-19-42
 */
public class SaveVipServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到用户信息
        String user = request.getParameter("user");
        System.out.println(user);
        //将user存放到session中
        request.getSession().setAttribute("vip",user);
        //跳转到购买界面
        request.getRequestDispatcher("/shopping.jsp").forward(request,response);
    }
}
