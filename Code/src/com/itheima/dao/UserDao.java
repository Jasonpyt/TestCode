package com.itheima.dao;



import com.itheima.domain.User;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.Random;

public class UserDao {
    private   QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

    public User getUsernameAndPassword(String username,String password) throws SQLException {
        String sql = "select * from user where username = ? and password = ?";

        return  qr.query(sql,new BeanHandler<>(User.class),username,password);
    }
}
