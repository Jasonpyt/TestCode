package com.itheima.dao;

import com.itheima.domain.Linkman;
import com.itheima.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class LinkmanDao {
    private QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

    public  void  save(Linkman l) throws SQLException {
        String sql = "insert into linkman values (null,?,?,?,?,?)";

        qr.update(sql,l.getLkm_name(),l.getLkm_gender(),l.getLkm_mobile(),l.getLkm_email(),l.getLkm_email(),l.getLkm_qq());
    }

}
