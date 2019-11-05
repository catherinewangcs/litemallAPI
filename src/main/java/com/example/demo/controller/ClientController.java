package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "ClientController")
public class ClientController {
    @ApiOperation(value = "传用户id和password",httpMethod = "POST")
    @PostMapping(value = "user/login")
    public JSONObject getUserIdPassword(@RequestParam(value = "userId")Long userId,@RequestParam(value = "password")Long password){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过id获取用户信息",httpMethod = "GET")
    @GetMapping(value = "user/{userId}")
    public JSONObject getUserId(@PathVariable(value = "userId")Long userId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过name获取用户信息",httpMethod = "GET")
    @GetMapping(value = "user/name/{userName}")
    public JSONObject getUserName(@PathVariable(value = "userName")Long userName){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过phone获取用户信息",httpMethod = "GET")
    @GetMapping(value = "user/phone/{userPhone}")
    public JSONObject getUserPhone(@PathVariable(value = "userPhone")Long userPhone){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "新建用户",httpMethod = "POST")
    @PostMapping(value = "user")
    public JSONObject insertUser(@RequestBody JSONObject user){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改用户信息",httpMethod = "PUT")
    @PutMapping(value = "user")
    public JSONObject updateUser(@RequestBody JSONObject user){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除用户",httpMethod = "DELETE")
    @DeleteMapping(value = "user/{userId}")
    public boolean deleteUser(@PathVariable(value = "userId")Long userId){
        return true;
    }
}
