package com.itheima.dao.impl;

import com.itheima.dao.ContactDao;
import com.itheima.domain.Contact;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements ContactDao{

    private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

    //去数据库中查询所有用户信息
    public List<Contact> findAll() throws SQLException {
         String sql = "select * from contact";

       return qr.query(sql, new BeanListHandler<>(Contact.class));
    }

    @Override
    public void deleteById(String id) throws SQLException {
        String sql = "delete from contact where id= ?";

        qr.update(sql,id);
    }

    @Override
    public List<Contact> conditionFind(String sex, String address)
            throws SQLException {
        // 先写一个基础的sql模板
        String sql = "select * from contact where 1=1 ";

        //  定义一个参数的集合   如果条件上有该参数 就添加到集合中。
        ArrayList<String> params = new ArrayList<>();

        // 根据条件 拼接sql
        if(sex!=null && sex.trim().length()>0){
            sql +=" and sex=? ";
            // 参数列表添加性别
            params.add(sex);
        }

        if(address!=null && address.trim().length()>0){
            sql +=" and address=?";
            // 参数列表添加籍贯
            params.add(address);
        }

       return qr.query(sql,new BeanListHandler<>(Contact.class),params.toArray());
    }

    @Override
    public List<Contact> findByPage(int pageNum, int pageSize)
            throws SQLException {
        String sql = "select * from contact limit ?,?";
                        //  当页起始索引          每页条数
        Object[] params = {(pageNum-1)*pageSize,pageSize};

        return qr.query(sql,new BeanListHandler<>(Contact.class),params);

    }
}
