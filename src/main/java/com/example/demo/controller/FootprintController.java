package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags= "FootprintController")
public class FootprintController {//未改
    @ApiOperation(value = "通过userId获取用户浏览足迹内容",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/footprintByUser")
    public JSONObject getfootprintByUser(@PathVariable(value = "userId")Long userId, @PathVariable(value = "footprintByUser")Long foodprint){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过goodId获取商品被浏览的信息",httpMethod = "GET")
    @GetMapping(value = "good/{goodId}/footprintByGood")
    public JSONObject getFootprintByGood(@PathVariable(value = "goodId")Long goodId, @PathVariable(value = "footprintByGood")Long foodprint){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除某用户的浏览足迹",httpMethod = "DELETE")
    @DeleteMapping(value = "user/{userId}/footprint")
    public JSONObject deleteFootprint(@PathVariable(value = "userId")Long userId,@PathVariable(value = "footprint")boolean isDeleted){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建某用户的浏览足迹",httpMethod = "POST")
    @PostMapping(value="user/{userId}/footprint")
    public JSONObject insertFootprint(@PathVariable (value = "userId")Long userId,@PathVariable(value = "footprint")Long footprint){
        JSONObject object=new JSONObject();
        return object;
    }

}
