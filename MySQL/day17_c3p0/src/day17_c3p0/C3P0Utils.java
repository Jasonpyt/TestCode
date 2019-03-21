package com.itheima.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
   java中提供的对外公共接口
     javax.sql.DataSource 这个规范 需要厂商实现。

     C3P0 有实现  ComboPooledDataSource 它就是一个连接池也可以叫数据源。

     是不是要通过连接池获取连接对象。

     1：创建连接池对象

     2：写一个方法  获取连接池

     3：写一个方法  获取连接对象
       现在 连接对象归连接池
       连接池有个方法叫做 getConnection() 获取连接对象

 */
public class C3P0Utils {
    //创建一个连接池对象
    // 因为我们按照规范 配置好了c3p0-config.xml 那么这个对象创建的时候会自动把配置信息关联上。
    private static DataSource dataSource = new ComboPooledDataSource();
    /*
      获取连接池对象  获取数据源
     */
    public static DataSource getDataSource(){
        return  dataSource;
    }
    /*
      获取连接对象
     */
    public static Connection getConnection(){

        try {
            return  dataSource.getConnection();
        } catch (SQLException e) {
            return null;
        }
    }

    /*
  释放资源
 */
    public static void close(ResultSet rs, Statement state , Connection conn){

        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println("释放结果集失败");
            }
        }

        if(state!=null){
            try {
                state.close();
            } catch (SQLException e) {
                System.out.println("释放语句执行平台失败");
            }
        }

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("释放连接对象失败");
            }
        }

    }

}
