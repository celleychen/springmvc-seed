package com.duelsol.basicspringmvc.dao.demo;

import com.duelsol.basicspringmvc.entity.demo.DemoEntity;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: 冯奕骅
 * Date: 14-8-30
 * Time: 23:19
 */
public interface DemoDao {

    public List<Map> findAllAccounts() throws SQLException;

    public DemoEntity getDemoByID(int id) throws SQLException;

}
