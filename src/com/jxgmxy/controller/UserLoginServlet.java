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
 * @create 2021-10-2021/10/28  14-48-02
 */

/**
 * 用户登录验证的servlet
 */
public class UserLoginServlet extends HttpServlet {
    UserService service = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到请求的数据
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        //调用service验证是否成功
        boolean user = service.selectUser(name, passwd);
        //判断用户是否存在，不存在则提示用户需要注册
        if (user){
            request.getSession().setAttribute("name",name);
            //登录成功
            response.sendRedirect("/main.jsp");
        }else {
            //登录失败
            request.setAttribute("msg","用户尚未注册，请先注册！");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }
}
