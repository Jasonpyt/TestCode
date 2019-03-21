package com.itheima.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {

    public static void main(String[] args) throws Exception {
        /*
          使用连接池的方式获取连接对象 并完成查询数据库信息
         */
        // 从连接池获取连接对象
        Connection conn = C3P0Utils.getConnection();

        // 写好sql语句模板
        String sql = "select * from users";

        //获取预编译对象
        PreparedStatement ps = conn.prepareStatement(sql);

        // 设置参数
        //执行sql语句
        ResultSet rs =
                ps.executeQuery();

        while(rs.next()){
            String name = rs.getString("name");
            String password = rs.getString("password");

            System.out.println(name+"  "+password);
        }

        C3P0Utils.close(rs,ps,conn);

    }
}
