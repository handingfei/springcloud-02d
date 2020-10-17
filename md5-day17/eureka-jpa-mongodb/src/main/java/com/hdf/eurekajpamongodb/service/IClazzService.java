package com.hdf.eurekajpamongodb.service;

import com.hdf.eurekajpamongodb.entity.Clazz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClazzService {


    List<Clazz> list(Clazz clazz);

    boolean save(Clazz clazz);

    boolean update(Integer id);

    boolean delete(Integer id);
}
