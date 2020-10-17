package com.hdf.eurekaservice.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@Data
public class Top {

    @TableId(value = "id")
    private int sid;

    private String sname;

    /**
     * 关联关系
     */
    @Max(10)
    @Min(9)
    private List<Zhangjie> zhangjies;
}
