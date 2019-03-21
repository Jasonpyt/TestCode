package com.itheima.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
   获取连接对象
    获取连接池对象的 一个工具类
 */
public class C3P0Utils {

    private static DataSource dataSource = new ComboPooledDataSource();
    //获取到一个连接对象
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
   //获取到一个连接池对象
    public static DataSource getDataSource(){
        return  dataSource;
    }
}
