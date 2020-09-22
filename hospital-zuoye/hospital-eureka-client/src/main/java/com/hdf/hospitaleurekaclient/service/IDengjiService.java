package com.hdf.hospitaleurekaclient.service;

import com.hdf.hospitaleurekaclient.entity.Dengji;
import com.baomidou.mybatisplus.service.IService;
import dto.DengjiDto;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 贾俊伟
 * @since 2020-09-18
 */
public interface IDengjiService extends IService<Dengji> {
    List<Dengji> dlist(DengjiDto vo);
}
