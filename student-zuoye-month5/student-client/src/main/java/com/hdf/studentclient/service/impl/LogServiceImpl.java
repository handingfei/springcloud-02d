package com.hdf.studentclient.service.impl;

import com.hdf.dto.LogDto;
import com.hdf.studentclient.entity.LogEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl {

    @Autowired
    MongoTemplate mongoTemplate;

    public void  mongo(LogDto logDto){
        LogEntity logEntity = new LogEntity();
        BeanUtils.copyProperties(logDto,logEntity);
        mongoTemplate.save(logEntity);
    }

}
