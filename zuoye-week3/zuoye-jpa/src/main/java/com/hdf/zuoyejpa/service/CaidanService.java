package com.hdf.zuoyejpa.service;

import com.hdf.dto.CaidanEntityDto;
import com.hdf.zuoyejpa.dao.CaidanRepository;
import com.hdf.zuoyejpa.entity.CaidanEntity;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CaidanService {

    @Autowired
    CaidanRepository caidanRepository;

    public Page<CaidanEntity> getPage(CaidanEntityDto caidanEntityDto) {

        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        PageRequest of = PageRequest.of(caidanEntityDto.getPageNo() - 1, caidanEntityDto.getPageSize(), sort);

        Page<CaidanEntity> all = caidanRepository.findAll(new Specification<CaidanEntity>(){

            @Override
            public Predicate toPredicate(Root<CaidanEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                List<Predicate> list = new ArrayList<Predicate>();
//                if (StringUtils.isNoneBlank(caidanEntityDto.getName())){
//
//                    Predicate name = criteriaBuilder.equal(root.get("name"),caidanEntityDto.getName());
//
//                    list.add(name);
//                }
                if (StringUtils.isNotBlank(caidanEntityDto.getName())){

                    Predicate name = criteriaBuilder.like(root.get("name"),"%"+caidanEntityDto.getName()+"%");
                    list.add(name);
                }

                if (StringUtils.isNoneBlank(caidanEntityDto.getBeginTime())&&StringUtils.isNotBlank(caidanEntityDto.getEndTime())){

                    String begin = caidanEntityDto.getBeginTime() + "00:00:00";
                    String end = caidanEntityDto.getEndTime() + "23:59:59";

                    Predicate createdTime = null;

                    try {
                        createdTime = criteriaBuilder.between(root.get("createdtime"), DateUtils.parseDate(begin,"yyyy-MM-dd HH:mm:ss"),DateUtils.parseDate(end,"yyyy-MM-dd HH:mm:ss"));

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    list.add(createdTime);
                }

                return criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
            }
        }, of);

        return all;
    }
}
