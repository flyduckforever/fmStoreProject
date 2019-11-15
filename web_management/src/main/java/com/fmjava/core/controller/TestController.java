package com.fmjava.core.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fmjava.core.pojo.good.Brand;
import com.fmjava.core.service.TestInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: fmStoreProject
 * @description:
 * @author: tianshengfei
 * @create: 2019-11-13 22:43
 **/
@RestController
public class TestController {

    @Reference
    private TestInterface testInterface;

    @RequestMapping("/getname")
    public List<Brand> getName(){
        return testInterface.getName();
    }
}
