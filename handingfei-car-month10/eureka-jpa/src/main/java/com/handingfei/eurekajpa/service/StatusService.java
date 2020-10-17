package com.handingfei.eurekajpa.service;

import com.handingfei.dto.TCarStatusEntityDto;
import com.handingfei.eurekajpa.dao.StatusDao;
import com.handingfei.eurekajpa.entity.TCarStatusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    StatusDao statusDao;

    /**
     * 查询下拉框
     * @param tCarStatusEntityDto
     * @return
     */
    public List<TCarStatusEntity> list(TCarStatusEntityDto tCarStatusEntityDto) {

        List<TCarStatusEntity> all = statusDao.findAll();
        return all;
    }
}
