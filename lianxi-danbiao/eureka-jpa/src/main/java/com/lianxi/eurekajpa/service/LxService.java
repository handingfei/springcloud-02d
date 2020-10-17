package com.lianxi.eurekajpa.service;

import com.hdf.dto.LianxiEntityDto;
import com.lianxi.eurekajpa.dao.LxDao;
import com.lianxi.eurekajpa.entity.LianxiEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LxService {

    @Autowired
    LxDao lxDao;

    public Page<LianxiEntity> getPage(LianxiEntityDto lxDto) {

        Sort sort = Sort.by(Sort.Direction.ASC,"id");
        PageRequest of = PageRequest.of(lxDto.getPageNo()-1,lxDto.getPageSize(),sort);

        Page<LianxiEntity> all = lxDao.findAll(new Specification<LianxiEntity>() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list=new ArrayList<>();
                if(StringUtils.isNotBlank(lxDto.getName())){
                    Predicate name = criteriaBuilder.like(root.get("name"), "%" + lxDto.getName() + "%");
                    list.add(name);
                }
                return criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
            }
        },of);
        return all;
    }

     public Page<LianxiEntity> getPage1(LianxiEntityDto lxDto) {

        Sort sort = Sort.by(Sort.Direction.ASC,"id");
         PageRequest of = PageRequest.of(lxDto.getPageNo() - 1, lxDto.getPageSize(), sort);

        Page<LianxiEntity> lian = lxDao.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {

                List<Predicate> list = new ArrayList<>();
                if (StringUtils.isNotBlank(lxDto.getName())){
                    Predicate name = criteriaBuilder.like(root.get("name"), "%" + lxDto.getName() + "%");
                    list.add(name);
                }

                return criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
            }
        });

         return lian;
    }






    public boolean save(LianxiEntity lianxiEntity) {
        LianxiEntity save = lxDao.save(lianxiEntity);
        return save!=null;
    }


    public boolean dels(Integer[] ids) {
        for (Integer id:ids) {
            lxDao.deleteById(id);
        }
        return true;

    }


}
