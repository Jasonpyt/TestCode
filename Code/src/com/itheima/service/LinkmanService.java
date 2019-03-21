package com.itheima.service;

import com.itheima.dao.LinkmanDao;
import com.itheima.domain.Linkman;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class LinkmanService {
        private LinkmanDao linkmanDao = new LinkmanDao();

        public  void save (Linkman linkman) throws SQLException {
           linkmanDao.save(linkman);
        }
    }

