package com.hdf.upmsbizeureka.mapper;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hdf.upmsbizeureka.entity.TCar;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB Mapper 接口
 * </p>
 *
 * @author handingfei
 * @since 2020-09-16
 */
public interface TCarMapper extends BaseMapper<TCar> {

    List<TCar> list1(Wrapper<TCar> wrapper);
}
