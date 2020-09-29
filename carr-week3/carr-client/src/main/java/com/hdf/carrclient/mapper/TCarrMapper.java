package com.hdf.carrclient.mapper;

import com.hdf.carrclient.entity.TCarr;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hdf.dto.TCarrDto;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB Mapper 接口
 * </p>
 *
 * @author handingfei
 * @since 2020-09-28
 */
public interface TCarrMapper extends BaseMapper<TCarr> {
    List<TCarr> carlist(TCarr tCarr);

    //List<TCarr> carlist(TCarrDto tCarrDto);
}
