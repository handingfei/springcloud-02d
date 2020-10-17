package com.lianxi.eurekajpa.service;

import com.lianxi.eurekajpa.dao.ManyDao;
import com.lianxi.eurekajpa.entity.ManytooneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyService {

    @Autowired
    ManyDao manyDao;


    public List<ManytooneEntity> list() {
        List<ManytooneEntity> all = manyDao.findAll();
        return all;
    }


}
