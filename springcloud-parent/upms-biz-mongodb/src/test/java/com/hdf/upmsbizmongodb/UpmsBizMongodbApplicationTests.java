package com.hdf.upmsbizmongodb;

import com.hdf.upmsbizmongodb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class UpmsBizMongodbApplicationTests {

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {

        User user = new User();

        List<User> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            user.setName("new Name"+i);
            user.setSex("new Sex"+i);
            list.add(user);
            mongoTemplate.insert(list,"user");
        }

    }

}
