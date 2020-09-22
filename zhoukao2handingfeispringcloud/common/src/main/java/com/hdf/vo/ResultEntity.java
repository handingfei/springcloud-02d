package com.hdf.vo;

import lombok.Data;

@Data
public class ResultEntity {
    private String code;
    private String msg;
    private Object object;
    public ResultEntity(){}
    public ResultEntity(String code, String msg, Object object){
        this.code=code;
        this.msg=msg;
        this.object=object;
    }
    public static ResultEntity suess(String code, String msg, Object object){
        return new ResultEntity(code,msg,object);
    }

}
