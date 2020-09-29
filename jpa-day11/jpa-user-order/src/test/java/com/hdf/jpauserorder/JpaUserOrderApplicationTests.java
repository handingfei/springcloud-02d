package com.hdf.jpauserorder;

import com.hdf.jpauserorder.dao.UserMapper;
import com.hdf.jpauserorder.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Entity;
import javax.persistence.Query;

@SpringBootTest
@Slf4j
class JpaUserOrderApplicationTests {

    @Autowired
    UserMapper userMapper;


    /**
     * 添加用户
     */
    @Test
    void insert() {

        Order user = null;
        Query insert = userMapper.insert(user);
    }

    /**
     * 添加订单
     */
    @Test
    void insert1() {

        Order order=null;
        Query insert = userMapper.insert(order);
    }
//根据id查询
    @Test
    void aa(){

        Entity findbyid = userMapper.findbyid(1);
        System.out.println(findbyid);
    }

    //根据时间查询
    @Test
    void bb(){
        Entity findbydate = userMapper.findbydate("2015-10-10");

        System.out.println(findbydate);
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    //逻辑删除
    @Test
    void cc(){

        boolean delete = userMapper.delete(1);
        System.out.println(delete);
    }

}
