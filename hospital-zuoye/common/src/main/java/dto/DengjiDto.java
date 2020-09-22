package dto;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 贾俊伟
 * @since 2020-09-18
 */
@Data
public class DengjiDto extends  Page{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String zyh;

    private String name;

    private String sex;

    private Integer age;

    private String dz;

    private String dh;

    private String sfz;

    private Date stadate;

    private Integer ks;

    private Integer ys;

    private Integer cw;
    private String cname;
    private String yname;
    private String kname;


}
