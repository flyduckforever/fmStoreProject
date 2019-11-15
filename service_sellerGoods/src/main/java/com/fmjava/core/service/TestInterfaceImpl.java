package com.fmjava.core.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.fmjava.core.dao.good.BrandDao;
import com.fmjava.core.pojo.good.Brand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: fmStoreProject
 * @description:
 * @author: tianshengfei
 * @create: 2019-11-13 22:25
 **/
@Service
public class TestInterfaceImpl implements TestInterface {

    @Autowired
    private BrandDao brandDao;

    @Override
    public List<Brand> getName() {
        //从数据库取出数据
        List<Brand> brands = brandDao.selectByExample(null);
        return brands;
    }
}
