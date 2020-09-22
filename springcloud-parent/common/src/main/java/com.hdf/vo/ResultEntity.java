package com.hdf.vo;


import lombok.Data;

@Data
public class ResultEntity {


    private String code;

    private String msg;

    private Object obj;

    public ResultEntity(){}
    private ResultEntity(String code,String msg,Object obj){
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }
    public static ResultEntity success(){
        return  new ResultEntity("200","操作成功",null);
    }
    public static ResultEntity success(String code){
        return  new ResultEntity(code,"操作成功",null);
    }
    public static ResultEntity success(String code,String msg){
        return  new ResultEntity(code,msg,null);
    }
    public static ResultEntity success(String code,String msg,Object o){
        return  new ResultEntity(code,msg,o);
    }



    public static ResultEntity fail(){
        return  new ResultEntity("500","操作失败",null);
    }
    public static ResultEntity fail(String code){
        return  new ResultEntity(code,"操作失败",null);
    }
    public static ResultEntity fail(String code,String msg){
        return  new ResultEntity(code,msg,null);
    }
    public static ResultEntity fail(String code,String msg,Object o){
        return  new ResultEntity(code,msg,o);
    }

}
