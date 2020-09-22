package com.handingfei.dingdanprovide.mapper;

import com.handingfei.dingdanprovide.entity.Dingdan;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
public interface DingdanMapper extends BaseMapper<Dingdan> {

    List<Dingdan> list();
}
