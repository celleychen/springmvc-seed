package com.duelsol.basicspringmvc.service.demo.impl;

import com.duelsol.basicspringmvc.entity.demo.DemoEntity;
import com.duelsol.basicspringmvc.service.BaseService;
import com.duelsol.basicspringmvc.service.demo.DemoService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: 冯奕骅
 * Date: 14-8-30
 * Time: 23:37
 */
@Service
public class DemoServiceImpl extends BaseService implements DemoService {

    @Override
    public List<Map> findAllAccounts() throws SQLException {
        return daoFactory.getDemoDao().findAllAccounts();
    }

    @Override
    public DemoEntity getDemoById(int id) throws SQLException {
        return daoFactory.getDemoDao().getDemoByID(id);
    }

    @Override
    public void saveDemos() {
        for (int i = 0; i < 10; i++) {
            DemoEntity entity = new DemoEntity();
            entity.setAmount(i);
            entity.setDetail("index:" + i);
            entity.save();
        }
    }

}
