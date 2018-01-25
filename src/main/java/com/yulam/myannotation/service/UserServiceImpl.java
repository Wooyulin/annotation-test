package com.yulam.myannotation.service;

import com.yulam.myannotation.annotation.ZxfResource;
import com.yulam.myannotation.dao.User1DaoImpl;
import com.yulam.myannotation.dao.User2DaoImpl;
import com.yulam.myannotation.dao.UserDaoImpl;

/**
 * @author: 5yl
 * email: massyulin@gmail.com
 * time : 2018/1/24 下午10:51
 */

public class UserServiceImpl {

    public UserDaoImpl userDao;
    public User1DaoImpl user1Dao;

    // 字段上的注解,可以配置name属性
    @ZxfResource
    public User2DaoImpl user2Dao;

    // set方法上的注解，带有name属性
    @ZxfResource(name = "userDao")
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    // set方法上的注解，没有配置name属性
    @ZxfResource
    public void setUser1Dao(User1DaoImpl user1Dao) {
        this.user1Dao = user1Dao;
    }

    public void show() {
        userDao.show();
        user1Dao.show1();
        user2Dao.show2();
        System.out.println("这里是Service方法........");
    }
}
