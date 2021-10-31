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
 * @create 2021-10-2021/10/28  16-52-30
 */

/**
 * 购买商品
 */
public class BuyGoodServlet extends HttpServlet {
    UserService service = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取到购买的金额
        String[] clothings = request.getParameterValues("clothing");
        String[] trousers = request.getParameterValues("trouser");
        String[] shoes = request.getParameterValues("shoe");
        //调用service处理结算
        Integer money = service.countMoney(clothings,trousers,shoes);
        //跳转页面
        //判断用户是否为Vip
        String isVip = (String) request.getSession().getAttribute("vip");
        if (isVip.equals("vip")){
            //为会员的话打八折
            double sum = money * 0.8;
            request.setAttribute("money",sum);
        }else {
            //普通用户原价
            request.setAttribute("money",money);
        }
        //跳转到结算页面
        request.getRequestDispatcher("/return.jsp").forward(request,response);
    }
}
