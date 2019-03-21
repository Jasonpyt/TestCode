package demo;


import java.sql.*;

/*
  JDBC工具类   静态方法
     减少我们一些代码量
        常用的操作提取到工具类中

        完成两个功能
          1：获取连接对象
          2：释放资源
 */
public class JDBCUtils {


    private static final  String DRIVER_NAME ="com.mysql.jdbc.Driver";
    private static final  String URL = "jdbc:mysql://localhost:3306/day03";
    private static final  String USERNAME="root";
    private static final  String PASSWORD="root";


    static{
        //1:注册驱动
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            System.out.println("注册失败");
        }
    }

    /*
      获取连接对象
        返回值 连接对象

     */
    public static Connection getConnection(){
      Connection conn = null;
        try {
          conn =  DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            System.out.println("连接失败");
        }

        return conn;
    }

    /*
      释放资源
     */
    public static void close(ResultSet rs, Statement state ,Connection conn){

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
