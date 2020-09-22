package com.hdf.upms.biz.eureka.client.web;

import com.hdf.dto.UserDto;
import com.hdf.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/test")
    public ResultEntity  test(UserDto userDto){
        HttpEntity httpEntity = new HttpEntity(userDto);
        ResultEntity body = restTemplate.postForEntity("http://UPMS-BIZ/user/list", httpEntity, ResultEntity.class).getBody();
        return body;
    }

}
