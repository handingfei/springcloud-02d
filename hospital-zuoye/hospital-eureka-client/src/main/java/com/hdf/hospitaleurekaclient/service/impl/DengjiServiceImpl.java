package com.hdf.hospitaleurekaclient.service.impl;

import com.hdf.hospitaleurekaclient.entity.Dengji;
import com.hdf.hospitaleurekaclient.mapper.DengjiMapper;
import com.hdf.hospitaleurekaclient.service.IDengjiService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import dto.DengjiDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 贾俊伟
 * @since 2020-09-18
 */
@Service
public class DengjiServiceImpl extends ServiceImpl<DengjiMapper, Dengji> implements IDengjiService {

    @Override
    public List<Dengji> dlist(DengjiDto vo) {
        return baseMapper.dlist(vo);
    }
}
