package com.hdf.userclient.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.Page;
import com.hdf.dto.Week2userDto;
import com.hdf.userclient.entity.Week2user;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务类
 * </p>
 *
 * @author handingfei
 * @since 2020-09-21
 */
public interface IWeek2userService extends IService<Week2user> {


    /**
     * 页面
     * @param week2userDto
     * @param vo
     * @return
     */
    List<Week2user> list1(Week2userDto week2userDto, Week2user vo);
}
