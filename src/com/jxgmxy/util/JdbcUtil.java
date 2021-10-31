package com.jxgmxy.util;

import java.sql.*;

public class JdbcUtil {
    /**
     * 工具类私有构造方法
     */
    private JdbcUtil() {}

    /**
     * 注册驱动
     */
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接方法
     * @return Connection
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
    }

    /**
     * 释放资源方法
     * @param cnnt 关闭连接
     * @param ps    预编译数据库操作对象
     * @param rs    查询结果集
     */
    public static void close(Connection cnnt, Statement ps, ResultSet rs){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (cnnt != null) {
            try {
                cnnt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

