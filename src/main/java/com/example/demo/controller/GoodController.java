package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "GoodsController")
public class GoodController {
    @ApiOperation(value = "新建商品",httpMethod = "POST")
    @PostMapping(value = "good")
    public JSONObject insertGood(@RequestBody JSONObject good){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "获取所有商品",httpMethod = "GET")
    @GetMapping(value = "good")
    public List<JSONObject> getGoodAll(){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "删除商品",httpMethod = "DELETE")
    @DeleteMapping(value = "good/{goodId}")
    public boolean deleteGood(@PathVariable(value = "goodId")Long goodId){
        return true;
    }

    @ApiOperation(value = "更改商品信息",httpMethod = "PUT")
    @PutMapping(value = "good/{goodId}")
    public JSONObject updateGood(@RequestBody JSONObject good){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品id获取订单信息",httpMethod = "GET")
    @GetMapping(value = "order/goods/{goodId}")
    public JSONObject getGoodById(@PathVariable(value = "goodId")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品编号获取订单信息",httpMethod = "GET")
    @GetMapping(value = "order/goods/sn/{goodSn}")
    public JSONObject getGoodBySn(@PathVariable(value = "goodSn")Long goodSn){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品名称获取信息",httpMethod = "GET")
    @GetMapping(value = "good/name/{goodName}")
    public JSONObject getGoodByName(@PathVariable(value = "goodName")Long goodName){
        JSONObject object=new JSONObject();
        return object;
    }
}
