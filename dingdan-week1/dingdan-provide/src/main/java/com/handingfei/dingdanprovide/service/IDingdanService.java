package com.handingfei.dingdanprovide.service;

import com.handingfei.dingdanprovide.entity.Dingdan;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务类
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
public interface IDingdanService extends IService<Dingdan> {
    List<Dingdan> list();
}
