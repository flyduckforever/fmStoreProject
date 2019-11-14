package com.fmjava.core.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @program: fmStoreProject
 * @description:
 * @author: tianshengfei
 * @create: 2019-11-13 22:25
 **/
@Service
public class TestInterfaceImpl implements TestInterface {
    @Override
    public String getName() {
        return "TestInterfaceImpl--dubbo";
    }
}
