package com.hdf.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 7168 kB
 * </p>
 *
 * @author handingfei
 * @since 2020-09-21
 */
@Data
@Accessors(chain = true)
public class Week2userDto extends Page {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

    private String nickname;

}
