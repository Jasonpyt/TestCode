package com.itheima.service;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private  UserDao userdao = new UserDao();

    public User login (String username,String password) throws SQLException {
        return  userdao.getUsernameAndPassword(username,password);
        }
    }



