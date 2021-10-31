package com.jxgmxy.service;

/**
 * @author dai
 * @create 2021-10-2021/10/28  14-49-48
 */
public interface UserService {
    /**
     * 验证是否有此用户
     */
    boolean selectUser(String name,String passwd);

    /**
     * 注册用户
     */
    int registUser(String name, String passwd);

    /**
     * 处理金额计算
     */
    Integer countMoney(String[] clothings, String[] trousers, String[] shoes);
}
