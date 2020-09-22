package com.hdf.upmsbizeureka.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hdf.upmsbizeureka.entity.TCar;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务类
 * </p>
 *
 * @author handingfei
 * @since 2020-09-16
 */
public interface ITCarService extends IService<TCar> {

    List<TCar> list1(Wrapper<TCar> wrapper);
}
