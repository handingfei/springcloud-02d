package vo;

import lombok.Data;

@Data
public class Res {
    private String code;
    private String msg;
    private Object object;
    public Res(){}
    public Res(String code,String msg,Object object){
        this.code=code;
        this.msg=msg;
        this.object=object;
    }
    public static Res suess(String code,String msg,Object object){
        return new Res(code,msg,object);
    }

}
