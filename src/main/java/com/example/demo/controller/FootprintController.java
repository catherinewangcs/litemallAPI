package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FootprintController {
    @ApiOperation(value = "用户查看用户个人浏览足迹", httpMethod = "GET")
    @GetMapping(value = "/footprints")
    public List<JSONObject> listUserFootprint() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "用户创建新浏览足迹", httpMethod = "POST")
    @PostMapping(value = "/footprints")
    public JSONObject insertFootprint(@RequestBody JSONObject footprint) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "用户清空个人的浏览足迹", httpMethod = "DELETE")
    @DeleteMapping(value = "/footprints")
    public boolean deleteFootprint() {
        return true;
    }

    @ApiOperation(value = "用户删除个人浏览足迹的某一条", httpMethod = "DELETE")
    @DeleteMapping(value = "/footprints/{id}")
    public boolean deleteOneFootprint(@PathVariable(value = "id") Long goodId) {
        return true;
    }

    @ApiOperation(value = "管理员查看某用户浏览足迹",httpMethod = "GET")
    @GetMapping(value = "/admin/users/{id}/footprints")
    public List<JSONObject> listUserFootprint(@PathVariable(value = "id")Long userId){
        return new ArrayList<>();
    }

}
