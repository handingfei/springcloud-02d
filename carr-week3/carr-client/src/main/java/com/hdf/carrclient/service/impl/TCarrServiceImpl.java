package com.hdf.carrclient.service.impl;

import com.hdf.carrclient.entity.TCarr;
import com.hdf.carrclient.mapper.TCarrMapper;
import com.hdf.carrclient.service.ITCarrService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hdf.dto.TCarrDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 * @author handingfei
 * @since 2020-09-28
 */
@Service
public class TCarrServiceImpl extends ServiceImpl<TCarrMapper, TCarr> implements ITCarrService {

    @Override
    public List<TCarr> carlist(TCarr tCarr) {
        return baseMapper.carlist(tCarr);
    }


}
