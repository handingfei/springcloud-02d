package com.hdf.eurekaservice.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Data
@Getter
@Setter
public class Fenlei {

    @TableId(value = "id")
    private int tid;

    private String fen;

    /**
     * 关联关系
     */


    @Max(10)
    @Min(9)
    List<Class> classes;
}
