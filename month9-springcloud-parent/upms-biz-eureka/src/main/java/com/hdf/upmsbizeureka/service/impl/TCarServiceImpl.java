package com.hdf.upmsbizeureka.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hdf.upmsbizeureka.entity.TCar;
import com.hdf.upmsbizeureka.mapper.TCarMapper;
import com.hdf.upmsbizeureka.service.ITCarService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 * @author handingfei
 * @since 2020-09-16
 */
@Service
public class TCarServiceImpl extends ServiceImpl<TCarMapper, TCar> implements ITCarService {

    @Override
    public List<TCar> list1(Wrapper<TCar> wrapper) {
        return baseMapper.list1(wrapper);
    }
}
