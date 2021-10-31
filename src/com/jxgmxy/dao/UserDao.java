package com.jxgmxy.dao;

/**
 * @author dai
 * @create 2021-10-2021/10/28  14-53-35
 */
public interface UserDao {
    /**
     *查询是否有此用户
     */
    boolean selectUser(String name, String passwd);

    /**
     * 注册用户
     */
    int registUser(String name, String passwd);
}
