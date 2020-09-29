package com.hdf.upmsbizmongodb.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

//@ApiIgnore
@Api(tags = "这个是web层")
@RestController
public class WebUser {

    @ApiOperation(value = "list方法",notes = "具体")
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "user",defaultValue = "默认实体类")
    })
    public String list(){

        return "web";
    }

}
