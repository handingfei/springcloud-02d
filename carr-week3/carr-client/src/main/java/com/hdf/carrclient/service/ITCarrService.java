package com.hdf.carrclient.service;

import com.hdf.carrclient.entity.TCarr;
import com.baomidou.mybatisplus.service.IService;
import com.hdf.dto.TCarrDto;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务类
 * </p>
 *
 * @author handingfei
 * @since 2020-09-28
 */
public interface ITCarrService extends IService<TCarr> {

    /**
     * 页面
     * @param tCarr
     * @return
     */
    List<TCarr> carlist(TCarr tCarr);
}
