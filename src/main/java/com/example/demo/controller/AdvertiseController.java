package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "AdvertiseController")
public class AdvertiseController {
    @ApiOperation(value = "管理员新建一个广告",httpMethod = "POST")
    @PostMapping(value = "/advertise")
    public JSONObject insertAdvertise(@RequestBody JSONObject advertise){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用一个广告",httpMethod = "DELETE")
    @DeleteMapping(value = "/advertise/{id}")
    public boolean deleteAdvertise(@PathVariable(value = "id")Long advertiseId){
        return true;
    }

    @ApiOperation(value = "管理员更改一个广告",httpMethod = "PUT")
    @PutMapping(value = "/advertise")
    public JSONObject updateAdvertise(@RequestBody JSONObject advertise){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过id获取某广告信息",httpMethod = "GET")
    @GetMapping(value = "/advertise/{id}")
    public JSONObject getAdvertise(@PathVariable(value = "id")Long advertiseId){
        JSONObject object=new JSONObject();
        return object;
    }
}
