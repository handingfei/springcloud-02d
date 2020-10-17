package com.handingfei.eurekajpa.service;


import com.handingfei.dto.TCarEntityDto;
import com.handingfei.eurekajpa.dao.TCarDao;
import com.handingfei.eurekajpa.entity.TCarEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class TCarService {

    @Autowired
    TCarDao tCarDao;

    public Page<TCarEntity> getPage(TCarEntityDto tCarEntityDto) {

        Sort sort = Sort.by(Sort.Direction.ASC,"id");
        PageRequest of = PageRequest.of(tCarEntityDto.getPageNo() - 1, tCarEntityDto.getPageSize(), sort);

        /**
         * 查询列表
         */
        Page<TCarEntity> all = tCarDao.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {

                List<Predicate> list = new ArrayList<>();
                if (StringUtils.isNotBlank(tCarEntityDto.getCarnum())){
                    Predicate carnum = criteriaBuilder.like(root.get("carnum"), "%" + tCarEntityDto.getCarnum() + "%");
                    list.add(carnum);
                }

                if (StringUtils.isNoneBlank((CharSequence) tCarEntityDto.getHdate())){
                    Predicate hdate = criteriaBuilder.like(root.get("hdate"), "%" + tCarEntityDto.getHdate() + "%");
                    list.add(hdate);
                }

                return criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
            }
        },of);

        return all;
    }


    /**
     * 删除
     * @param ids
     * @return
     */
    public boolean delete(Integer[] ids) {
        for(Integer id:ids){
            tCarDao.deleteById(id);
        }
        return true;
    }

    /**
     * 添加
     * @param carEntityDto
     * @return
     */
    public boolean add(TCarEntity carEntityDto) {
        TCarEntity save = tCarDao.save(carEntityDto);

        return save!=null;
    }
}
