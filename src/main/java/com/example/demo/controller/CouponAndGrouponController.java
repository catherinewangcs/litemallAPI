package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "CouponAndGrouponController")
public class CouponAndGrouponController {
    @ApiOperation(value = "查看用户可领取优惠券", httpMethod = "GET")
    @GetMapping(value = "/coupon-rules")
    public List<JSONObject> getUserCouponRules() {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看用户个人优惠券", httpMethod = "GET")
    @GetMapping(value = "/coupons")
    public List<JSONObject> getUserCoupons() {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "领取一张优惠券", httpMethod = "POST")
    @PostMapping(value = "/coupons")
    public JSONObject insertCoupons(@RequestBody JSONObject coupon) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员新建一种优惠券",httpMethod = "POST")
    @PostMapping(value = "/coupon-rules")
    public JSONObject insertCouponRules(@RequestBody JSONObject couponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用一种优惠券",httpMethod = "DELETE")
    @DeleteMapping(value = "/coupon-rules/{id}")
    public boolean deleteCoupon(@PathVariable(value = "id")Long couponRulesId){
        return true;
    }

    @ApiOperation(value = "管理员更改一种优惠券信息",httpMethod = "PUT")
    @PutMapping(value = "/coupon-rules")
    public JSONObject updateCoupon(@RequestBody JSONObject couponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员新建团购规则",httpMethod = "POST")
    @PostMapping(value = "/groupon-rules")
    public JSONObject insertGrouponRules(@RequestBody JSONObject grouponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员通过团购规则id获取团购规则内容",httpMethod = "GET")
    @GetMapping(value = "/groupon-rules/{id}")
    public JSONObject getGrouponRules(@PathVariable(value = "id")Long grouponRulesId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员修改某团购规则内容",httpMethod = "PUT")
    @PutMapping(value = "/groupon-rules")
    public JSONObject updateGrouponRules(@RequestBody JSONObject grouponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用一个团购规则",httpMethod = "DELETE")
    @DeleteMapping(value = "/groupon-rules/{id}")
    public boolean deleteGrouponRules(@PathVariable(value = "id")Long grouponRulesId){
        return true;
    }

    @ApiOperation(value = "通过团购商品id获取该商品上的团购规则",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/groupon-rules")
    public JSONObject getGrouponRulesByGoods(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过团购商品名称获取该商品上的团购规则",httpMethod = "GET")
    @GetMapping(value = "/goods/search/groupon-rules")
    public JSONObject getGrouponRulesByGoodName(@RequestParam(value = "name")String goodName){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过id获取一种优惠券信息",httpMethod = "GET")
    @GetMapping(value = "/coupon-rules/{id}")
    public JSONObject getCouponRules(@PathVariable(value = "id")Long couponRulesId){
        JSONObject object=new JSONObject();
        return object;
    }
}
