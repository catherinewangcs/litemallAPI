package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShareController {
    @ApiOperation(value = "管理员新建一个分享规则", httpMethod = "POST")
    @PostMapping(value = "/share-rules")
    public JSONObject insertShareRules(@RequestBody JSONObject shareRules) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员修改一个分享规则",httpMethod = "PUT")
    @PutMapping(value = "/share-rules")
    public JSONObject updateShareRules(@RequestBody JSONObject shareRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用一个分享规则",httpMethod = "DELETE")
    @DeleteMapping(value = "/share-rules/{id}")
    public boolean deleteShareRules(@PathVariable(value = "id")Long shareRulesId){
        return true;
    }

    @ApiOperation(value = "通过商品id查看商品分享规则",httpMethod = "GET")
    @GetMapping(value = "/share-rules/{id}")
    public JSONObject getShareRules(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品名称查看商品分享规则",httpMethod = "GET")
    @GetMapping(value = "/share-rules/search")
    public JSONObject getShareRulesByName(@RequestParam(value = "name") String goodName){
        JSONObject object=new JSONObject();
        return object;
    }
}
