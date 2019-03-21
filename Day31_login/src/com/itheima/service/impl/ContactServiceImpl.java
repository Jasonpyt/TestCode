package com.itheima.service.impl;

import com.itheima.dao.ContactDao;
import com.itheima.dao.impl.ContactDaoImpl;
import com.itheima.domain.Contact;
import com.itheima.domain.PageBean;
import com.itheima.service.ContactService;

import java.sql.SQLException;
import java.util.List;

public class ContactServiceImpl implements ContactService{

    private ContactDao dao = new ContactDaoImpl();

    // 去数据库中查询所有用户 返回给servlet
    public List<Contact> findAll(){
        try {
          return dao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void deleteById(String id) {
        try {
            dao.deleteById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contact> conditionFind(String sex, String address) {
        try {
            return dao.conditionFind(sex,address);
        } catch (SQLException e) {
            return  null;
        }


    }

    @Override
    public List<Contact> findByPage(int pageNum, int pageSize) {
        try {
            return dao.findByPage(pageNum,pageSize);
        } catch (SQLException e) {
            return  null;
        }
    }

    /*
       完成 pageBean封装
     */
    @Override
    public PageBean<Contact> getPageBean(int pageNum, int pageSize) {



        try {
            PageBean<Contact> pb = new PageBean<>();

            pb.setPageNum(pageNum);
            pb.setPageSize(pageSize);
            // 当前页数据
            List<Contact> data = dao.findByPage(pageNum, pageSize);

            pb.setData(data);
            // 总条数  需要查询数据库
            List<Contact> all = dao.findAll();
            pb.setTotal(all.size());
            // 总页数

            pb.setTotalPage(pb.getTotalPage());

            return  pb;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
