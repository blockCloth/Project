package com.jxgmxy.controller;

import com.jxgmxy.service.UserService;
import com.jxgmxy.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author dai
 * @create 2021-10-2021/10/28  15-41-54
 */
public class UserRegistServlet extends HttpServlet {
    UserService service = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到用户注册的用户名密码
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        //调用service进行插入
        int result = service.registUser(name,passwd);
        //用户是否注册成功
        if (result == 1){
            //注册成功,返回到登录界面
            response.sendRedirect("/index.jsp");
        }else {
            //注册失败,提示信息，返回到注册页
            request.setAttribute("msg","用户注册失败，请重新注册！");
            request.getRequestDispatcher("/regist.jsp").forward(request,response);
        }
    }
}
