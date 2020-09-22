package com.hdf.userclient.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.Page;
import com.hdf.dto.Week2userDto;
import com.hdf.userclient.entity.Week2user;
import com.hdf.userclient.mapper.Week2userMapper;
import com.hdf.userclient.service.IWeek2userService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 * @author handingfei
 * @since 2020-09-21
 */
@Service
public class Week2userServiceImpl extends ServiceImpl<Week2userMapper, Week2user> implements IWeek2userService {


    /**
     * 页面
     * @param week2userDto
     * @param vo
     * @return
     */
    @Override
    public List<Week2user> list1(Week2userDto week2userDto, Week2user vo) {
        return baseMapper.list1(week2userDto,vo);
    }
}
