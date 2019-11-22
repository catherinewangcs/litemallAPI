package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "AdminController")
public class AdminController {
    @ApiOperation(value = "管理员登陆", httpMethod = "POST")
    @PostMapping(value = "/admin/login")
    public JSONObject getUserIdPassword(@RequestParam(value = "adminId") Long adminId, @RequestParam(value = "password") Long password) {
        JSONObject object = new JSONObject();
        return object;
    }
}
