package com.hdf.shoppingitemservice.service;

import com.hdf.dto.TItemDto;
import com.hdf.shoppingitemservice.dao.TiemDao;
import com.hdf.shoppingitemservice.entity.TItemEntity;
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
import java.util.List;
import java.util.Optional;

@Service
public class TItemService {
    @Autowired
    TiemDao tiemDao;

    public Page<TItemEntity> findAll(TItemDto t){
        PageRequest of = null;
        if(t.getSort()==1){
            Sort sort=Sort.by(Sort.Direction.DESC,new String[]{"itemPrice"});
          of=PageRequest.of(t.getPageNo()-1,t.getPageSize(),sort);
        }else if(t.getSort()==2){
            Sort sort=Sort.by(Sort.Direction.DESC,new String[]{"itemSales"});
            of=PageRequest.of(t.getPageNo()-1,t.getPageSize(),sort);
        }else {
            of=PageRequest.of(t.getPageNo()-1,t.getPageSize());
        }
        Page<TItemEntity> all = tiemDao.findAll(new Specification<TItemEntity>() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list=new ArrayList<>();
                if(StringUtils.isNotBlank(t.getItemBrand())){
                    Predicate like = criteriaBuilder.equal(root.get("itemBrand"), t.getItemBrand());
                    list.add(like);
                }
                if(StringUtils.isNotBlank(t.getItemColor())){
                    Predicate itemColor = criteriaBuilder.equal(root.get("itemColor"), t.getItemColor());
                    list.add(itemColor);
                }
                return criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
            }
        },of);
        return all;
    }


    public TItemEntity findById(Integer id){
        Optional<TItemEntity> byId = tiemDao.findById(id);
        return byId.get();
    }
}
