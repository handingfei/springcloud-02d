package com.handingfei.eurekajpa.service;

import com.handingfei.dto.TPersonEntityDto;
import com.handingfei.eurekajpa.dao.PersonDao;
import com.handingfei.eurekajpa.entity.TPersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    /**
     * 查询下拉框
     * @param tPersonEntityDto
     * @return
     */
    public List<TPersonEntity> list(TPersonEntityDto tPersonEntityDto) {

        List<TPersonEntity> all = personDao.findAll();
        return all;
    }
}
