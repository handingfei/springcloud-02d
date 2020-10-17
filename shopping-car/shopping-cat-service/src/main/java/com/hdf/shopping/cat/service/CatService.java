package com.hdf.shopping.cat.service;

import com.alibaba.fastjson.JSON;
import com.hdf.dto.CatDto;
import com.hdf.shopping.cat.entity.Cat;
import com.hdf.vo.CatVo;
import com.hdf.vo.TItemVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CatService {
    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    ItemService itemService;

    public Map<String,Object> findPage(CatDto catDto){
        System.err.println(JSON.toJSONString(catDto)+"dao");
        Query query=new Query(Criteria.where("UserID").is(catDto.getUserID()));
        query.skip((catDto.getPageNo()-1)*catDto.getPageSize());
        query.limit(catDto.getPageSize());
        long count = mongoTemplate.count(query, Cat.class);
        List<Cat> cats = mongoTemplate.find(query, Cat.class);
        List<CatVo> catVos=new ArrayList<>();
        for (Cat c:cats
             ) {
            int itemID = c.getItemID();
            System.err.println(JSON.toJSONString(c)+"da11o");
            TItemVo byId = itemService.findById(itemID);
            if(byId!=null){
                System.err.println(JSON.toJSONString(catDto)+"da11o");
                CatVo catVo=new CatVo();
                BeanUtils.copyProperties(c,catVo);
                catVo.setItemImage(byId.getItemImage());
                catVo.setItemName(byId.getItemName());
                catVos.add(catVo);
            }


        }
        Map<String,Object> map=new HashMap<>();
        map.put("total",count);
        map.put("list",catVos);
        return map;
    }
    public void  save(CatDto catDto){
        Cat cat=new Cat();
        BeanUtils.copyProperties(catDto,cat);
        mongoTemplate.save(cat);
    }
    public void update(CatDto catDto) {
        Cat catEntity = new Cat();
        BeanUtils.copyProperties(catDto,catEntity);
        Query query = Query.query(Criteria.where("itemID").is(catEntity.getItemID()).and("userID").is(catDto.getUserID()));
        Update update = Update.update("itemNumber",catEntity.getItemNumber()).set("total",catEntity.getTotal());
        mongoTemplate.updateMulti(query,update,Cat.class);
    }

    public void del(CatDto catDto){
        Cat catEntity = new Cat();
        BeanUtils.copyProperties(catDto,catEntity);
        Query query = Query.query(Criteria.where("itemID").is(catEntity.getItemID()).and("userID").is(catDto.getUserID()));
        mongoTemplate.findAndRemove(query,Cat.class);
    }
}
