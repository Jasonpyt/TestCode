package demo;

import java.sql.*;
import java.util.Scanner;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class UserLoginDemo {
	public static void main(String[] args) throws SQLException {
		//1.��ȡ����̨��������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = sc.next();
		System.out.println("����������");
		String password = sc.next();

		Connection conn = JDBCUtils.getConnection();
		Statement state = conn.createStatement();
		//4: ���ǲ�ѯ���  ִ�еĲ�ѯ��sql
		String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
		ResultSet resultSet = state.executeQuery(sql);

		User user = null;

		// 5����������
		if (resultSet.next()){
			//������һ������
			int i = resultSet.getInt("id" );
			String u = resultSet.getString("username");
			String p = resultSet.getString("password");
			String e= resultSet.getString("email");
			user = new User(i,u,p,e);

		}

		if (user != null) {
			System.out.println("��¼�ɹ� �� " + user);
		} else {
			System.out.println("��¼ʧ��:�û������������");
		}
	}
}

