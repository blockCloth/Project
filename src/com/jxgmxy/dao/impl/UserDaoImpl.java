package com.jxgmxy.dao.impl;

import com.jxgmxy.dao.UserDao;
import com.jxgmxy.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author dai
 * @create 2021-10-2021/10/28  14-55-28
 */
public class UserDaoImpl implements UserDao {

    @Override
    public boolean selectUser(String name, String passwd) {
        Connection cnnt = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean isUser = false;
        try {
            cnnt = JdbcUtil.getConnection();
            //获取预编译的数据库对象
            String sql = "select name,password from user where name=? and password=?";
            ps = cnnt.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,passwd);

            rs = ps.executeQuery();
            isUser = rs.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(cnnt,ps,rs);
        }
        return isUser;
    }

    @Override
    public int registUser(String name, String passwd) {
        Connection cnnt = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            cnnt = JdbcUtil.getConnection();
            //获取预编译的数据库对象
            String sql = "insert into user(name,password) values (?,?)";
            ps = cnnt.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,passwd);

            result = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtil.close(cnnt,ps,null);
        }
        return result;
    }
}
