package demo;

import java.sql.*;
import java.util.Scanner;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class UserLoginDemo {
	public static void main(String[] args) throws SQLException {
		//1.获取控制台输入内容
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.next();
		System.out.println("请输入密码");
		String password = sc.next();

		Connection conn = JDBCUtils.getConnection();
		Statement state = conn.createStatement();
		//4: 这是查询语句  执行的查询的sql
		String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
		ResultSet resultSet = state.executeQuery(sql);

		User user = null;

		// 5：处理结果集
		if (resultSet.next()){
			//解析第一行数据
			int i = resultSet.getInt("id" );
			String u = resultSet.getString("username");
			String p = resultSet.getString("password");
			String e= resultSet.getString("email");
			user = new User(i,u,p,e);

		}

		if (user != null) {
			System.out.println("登录成功 ： " + user);
		} else {
			System.out.println("登录失败:用户名或密码错误！");
		}
	}
}

