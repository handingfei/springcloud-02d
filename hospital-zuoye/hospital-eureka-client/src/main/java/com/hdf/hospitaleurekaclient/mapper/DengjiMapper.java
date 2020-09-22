package com.hdf.hospitaleurekaclient.mapper;

import com.hdf.hospitaleurekaclient.entity.Dengji;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import dto.DengjiDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 贾俊伟
 * @since 2020-09-18
 */
public interface DengjiMapper extends BaseMapper<Dengji> {

    List<Dengji> dlist(@Param("vo") DengjiDto vo);
}
