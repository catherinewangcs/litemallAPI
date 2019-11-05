package com.example.demo.controller;


//浏览足迹、收藏夹、搜索历史

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ydwang
 */
@Api(tags = "TraceController")
@RestController
@RequestMapping(value = "trace")
public class TraceController {

    @ApiOperation(value = "查看用户搜索历史",httpMethod = "GET")
    @GetMapping(value = "/history/user/{userId}")
    public List<JSONObject> listUserHistory(@PathVariable(value = "userId") Long userId){
        return new ArrayList<>();
    }

    @ApiOperation(value = "查看用户浏览足迹",httpMethod = "GET")
    @GetMapping(value = "/footprint/user/{userId}")
    public List<JSONObject> listUserFootprint(@PathVariable(value = "userId")Long userId){
        return new ArrayList<>();
    }

    @ApiOperation(value = "查看用户收藏夹",httpMethod = "GET")
    @GetMapping(value = "/favorites/user/{userId}")
    public List<JSONObject> listUserFavorites(@PathVariable(value = "userId")Long userId){
        return new ArrayList<>();
    }

    @ApiOperation(value = "通过关键字检索搜索历史",httpMethod = "GET")
    @GetMapping(value = "/history/keyword/{keyword}")
    public List<JSONObject> listKeywordHistory(@PathVariable(value = "keyword")Long keyword){
        return new ArrayList<>();
    }

    @ApiOperation(value = "查看商品的浏览足迹",httpMethod = "GET")
    @GetMapping(value = "/footprint/good/{goodId}")
    public List<JSONObject> listGoodIdFootprint(@PathVariable(value = "goodId")Long goodId){
        return new ArrayList<>();
    }

    @ApiOperation(value ="查看商品被放入的收藏夹",httpMethod = "GET")
    @GetMapping(value = "/favorites/good/{goodId}")
    public List<JSONObject> listGoodIdFavorites(@PathVariable(value = "goodId")Long goodId){
        return new ArrayList<>();
    }

    @ApiOperation(value = "创建某用户的新搜索历史",httpMethod = "POST")
    @PostMapping(value="/history/user/{userId}")
    public JSONObject insertHistory(@PathVariable(value = "userId")Long userId,@RequestBody JSONObject history){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建某用户的新收藏",httpMethod = "POST")
    @PostMapping(value="/favorites/user/{userId}")
    public JSONObject insertFavorites(@PathVariable(value = "userId")Long userId,@RequestBody JSONObject favorites){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建某用户的新浏览足迹",httpMethod = "POST")
    @PostMapping(value="/footprint/user/{userId}")
    public JSONObject insertFootprint(@PathVariable(value = "userId")Long userId,@RequestBody JSONObject footprint){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "清空某用户的搜索历史",httpMethod = "DELETE")
    @DeleteMapping(value = "/history/user/{userId}")
    public boolean deleteHistory(@PathVariable (value = "userId")Long userId){
        return true;
    }

    @ApiOperation(value = "清空某用户的浏览足迹",httpMethod = "DELETE")
    @DeleteMapping(value = "/footprint/user/{userId}")
    public boolean deleteFootprint(@PathVariable (value = "userId")Long userId){
        return true;
    }

    @ApiOperation(value = "清空某用户的收藏夹",httpMethod = "DELETE")
    @DeleteMapping(value = "/favorites/user/{userId}")
    public boolean deleteFavorites(@PathVariable (value = "userId")Long userId){
        return true;
    }

    @ApiOperation(value = "删除用户的收藏夹的某商品",httpMethod = "DELETE")
    @DeleteMapping(value = "/favorites/user/{userId}/good/{goodId}")
    public boolean deleteOneFavorites(@PathVariable (value = "userId")Long userId,@PathVariable(value = "goodId")Long goodId){
        return true;
    }

    @ApiOperation(value = "删除用户浏览足迹的某一条",httpMethod = "DELETE")
    @DeleteMapping(value = "/footprint/user/{userId}/good/{goodId}")
    public boolean deleteOneFootprint(@PathVariable (value = "userId")Long userId,@PathVariable(value = "goodId")Long goodId){
        return true;
    }

    @ApiOperation(value = "删除用户的搜索历史的某一条",httpMethod = "DELETE")
    @DeleteMapping(value = "/history/user/{userId}/good/{goodId}")
    public boolean deleteOneHistory(@PathVariable (value = "userId")Long userId,@PathVariable(value = "goodId")Long goodId){
        return true;
    }
}
