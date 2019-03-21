package com.itheima.dao;

import com.itheima.domain.Contact;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public interface ContactDao {



    //去数据库中查询所有用户信息
    public abstract   List<Contact> findAll() throws SQLException;

    // 根据用户id删除该用户信息
    public abstract void deleteById(String id) throws SQLException;

    // 根据多个条件进行查询用户的信息
    public abstract List<Contact> conditionFind(String sex, String address) throws SQLException;

    // 根据 页码与每页条数 查询出当页数据
    public abstract List<Contact> findByPage(int pageNum, int pageSize) throws SQLException;

}
