package com.hdf.upmsbizjpaeureka;

import com.alibaba.fastjson.JSON;
import com.hdf.upmsbizjpaeureka.dao.UserEntityManager;
import com.hdf.upmsbizjpaeureka.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Entity;
import java.util.List;

@SpringBootTest
@Slf4j
class UpmsBizJpaEurekaApplicationTests {

    @Autowired
    UserEntityManager userEntityManager;

    @Test
    void list() {
        System.out.println("aaaaaaaaaaaaaaaa");
        //List<Entity> all = userEntityManager.findAll();
        //log.info(JSON.toJSONString(all)+"-------------------------------------------------------");
    }

    @Test
    void findById(){

        UserEntity byId = userEntityManager.findById(3);

        log.info(JSON.toJSONString(byId)+"+++++++++++++++++++++++++++++++++++++++++++++++++++");
    }





}
