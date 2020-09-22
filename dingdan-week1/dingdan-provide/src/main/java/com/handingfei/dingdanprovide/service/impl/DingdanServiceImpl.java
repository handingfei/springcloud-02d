package com.handingfei.dingdanprovide.service.impl;

import com.handingfei.dingdanprovide.entity.Dingdan;
import com.handingfei.dingdanprovide.mapper.DingdanMapper;
import com.handingfei.dingdanprovide.service.IDingdanService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
@Service
public class DingdanServiceImpl extends ServiceImpl<DingdanMapper, Dingdan> implements IDingdanService {

    @Autowired
    DingdanMapper dingdanMapper;

    @Override
    public List<Dingdan> list() {
        return dingdanMapper.list();
    }
}
