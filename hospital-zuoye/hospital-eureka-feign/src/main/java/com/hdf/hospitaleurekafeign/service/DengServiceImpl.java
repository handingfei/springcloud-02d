package com.hdf.hospitaleurekafeign.service;

import dto.DengjiDto;
import vo.Res;

public class DengServiceImpl implements DengService {
    @Override
    public Res list(DengjiDto dengjiDto) {
        return Res.suess("500","调用列表失败",null);
    }

    @Override
    public Res klist() {
        return Res.suess("500","科室查询错误",null);
    }

    @Override
    public Res ylist(Integer id) {
        return Res.suess("500","医生查询错误",null);
    }

    @Override
    public Res clist(Integer id) {
        return Res.suess("500","床位查询错误",null);
    }

    @Override
    public Res add(DengjiDto dengjiDto) {
        return Res.suess("500","添加失败",null);
    }

    @Override
    public Res delete(Integer[] ids) {
        return Res.suess("500","添加失败",null);
    }
}
