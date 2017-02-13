package com.duelsol.springmvcseed.dao.demo.impl;

import com.duelsol.springmvcseed.dao.demo.DemoDao;
import com.duelsol.springmvcseed.dao.BaseDao;
import com.duelsol.springmvcseed.entity.demo.DemoEntity;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: 冯奕骅
 * Date: 14-8-30
 * Time: 23:20
 */
@Repository
public class DemoDaoImpl extends BaseDao implements DemoDao {

    @Override
    public List<Map> findAllAccounts() throws SQLException {
        return sqlSessionTemplate.selectList("demoDao.findAllAccounts");
    }

    @Override
    public DemoEntity getDemoByID(int id) throws SQLException {
        return sqlSessionTemplate.selectOne("demoDao.getDemoByID", id);
    }

}