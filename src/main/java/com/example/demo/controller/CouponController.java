package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "CouponController")
public class CouponController {
    @ApiOperation(value = "新建优惠卷",httpMethod = "POST")
    @PostMapping(value = "coupon")
    public JSONObject insertCoupon(@RequestBody JSONObject coupon){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除优惠卷",httpMethod = "DELETE")
    @DeleteMapping(value = "coupon/{couponId}")
    public boolean deleteCoupon(@PathVariable(value = "couponId")Long couponId){
        return true;
    }

    @ApiOperation(value = "获取所有优惠卷",httpMethod = "GET")
    @GetMapping(value = "coupon")
    public List<JSONObject> getCouponAll(){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "更改优惠卷信息",httpMethod = "PUT")
    @PutMapping(value = "coupon")
    public JSONObject updateCoupon(@RequestBody JSONObject coupon){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过优惠卷id获取优惠卷信息",httpMethod = "GET")
    @GetMapping(value = "coupon/{couponId}")
    public JSONObject getCouponById(@PathVariable(value = "couponId")Long couponId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过优惠卷类型获取优惠卷信息",httpMethod = "GET")
    @GetMapping(value = "coupon/type/{couponType}")
    public List<JSONObject> getCouponByType(@PathVariable(value = "couponType")Long couponType){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看用户不同状态的优惠卷",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/coupon/status/{couponStatus}")
    public List<JSONObject> getCouponByStatus(@PathVariable(value = "userId")Long userId,@PathVariable(value = "couponStatus")Long couponStatus){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看用户不同种类的优惠卷",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/coupon/type/{couponType}")
    public List<JSONObject> getCouponByType(@PathVariable(value = "userId")Long userId,@PathVariable(value = "couponType")Long couponType){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }
}
