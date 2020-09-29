package com.hdf.upmsbizswagger.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api("这是类")
@RestController
public class HelloSwaggerController {

    /**
     * sayHello方法
     * @param name
     * @return
     */
    //@ApiIgnore
    @ApiOperation(value = "list",notes = "类")
    @RequestMapping("/list")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "这是方法参数")
    })
    public String sayHello(String name){

        return "list";
    }



    /**
     * //login方法
     * @param name
     * @param password
     * @return
     */
    //@ApiIgnore
    @ApiOperation(value = "login",notes = "类")
    @RequestMapping("/login")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(value = "这是方法参数")
    })
    public String login(String name,String password){

        return "login";
    }

}
