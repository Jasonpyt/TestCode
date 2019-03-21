package com.itheima.service;

import com.itheima.dao.ContactDao;
import com.itheima.domain.Contact;
import com.itheima.domain.PageBean;

import java.sql.SQLException;
import java.util.List;

public interface ContactService {


    public abstract List<Contact> findAll();

    // 根据id删除 用户信息
    public abstract void deleteById(String id) ;

    // 根据多条件进行查询 用户信息
    public abstract  List<Contact> conditionFind(String sex, String address);

    // 根据 页码与每页条数 完成分页查询数据
    public abstract  List<Contact> findByPage(int pageNum, int pageSize);

    PageBean<Contact> getPageBean(int pageNum, int pageSize);
}
