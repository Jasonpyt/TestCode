package Demo03;

import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.获取控制台输入内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        //1.注册
        Class.forName("com.mysql.jdbc.Driver");
        //2.关联
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        //3.创建链接对象
        Statement statement = connection.createStatement();
        //4.操作sql语句
        ResultSet rs = statement.executeQuery("SELECT * FROM user");
        //4: 这是查询语句  执行的查询的sql
        String sql = "select * from user where username = '" + username + "' and password = '" + password + "'";
        ResultSet resultSet = statement.executeQuery(sql);

        User user = null;

        // 5：处理结果集
        if (resultSet.next()) {
            //解析第一行数据
            int i = resultSet.getInt("id");
            String u = resultSet.getString("username");
            String p = resultSet.getString("password");
            String e = resultSet.getString("email");
            user = new User(i, u, p, e);

        }

        if (user != null) {
            System.out.println("登录成功 ： " );
            System.out.println(user);
        } else {
            System.out.println("登录失败:用户名或密码错误！");
        }
    }
}

