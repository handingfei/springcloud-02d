package com.hdf.upmsbizjpa;

import com.hdf.upmsbizjpa.dao.UserEntityMapper;
import com.hdf.upmsbizjpa.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class UpmsBizJpaApplicationTests {

    @Autowired
    UserEntityMapper userEntityMapper;

    @Test
    void insert() {

        userEntityMapper.insert("1");
        log.info("1");
    }

    @Test
    void insert1(){
        userEntityMapper.insert1("1");
        log.info("1");
    }

    @Test
    void list(){
        List<User> list = userEntityMapper.list();
        log.info(String.valueOf(list));
    }

    @Test
    void find(){
        List<User> findbyid = userEntityMapper.findbyid();
        log.info(String.valueOf(findbyid));
    }

    @Test
    void delete(){
        boolean delete = userEntityMapper.delete(1);
        log.info(String.valueOf(delete));
    }


}
