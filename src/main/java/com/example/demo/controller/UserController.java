package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@Api(value = "UserController")
public class UserController {
    @ApiOperation(value = "获取个人所有地址", httpMethod = "GET")
    @GetMapping(value = "/addresses")
    public List<JSONObject> getAddressAll() {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "创建用户个人新地址", httpMethod = "POST")
    @PostMapping(value = "/addresses")
    public JSONObject insertAddress(@RequestBody JSONObject address) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改用户个人某地址信息", httpMethod = "PUT")
    @PutMapping(value = "/addresses/{id}")
    public JSONObject updateUser(@PathVariable(value = "id") Long addressId, @RequestBody JSONObject address) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除用户个人的某地址", httpMethod = "DELETE")
    @DeleteMapping(value = "/addresses/{id}")
    public boolean deleteUserAddress(@PathVariable(value = "id") Long addressId) {
        return true;
    }

    @ApiOperation(value = "用户登陆", httpMethod = "POST")
    @PostMapping(value = "/login")
    public JSONObject getUserIdPassword(@RequestParam(value = "userId") Long userId, @RequestParam(value = "password") String password) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改用户个人信息", httpMethod = "PUT")
    @PutMapping(value = "/info")
    public JSONObject updateUser(@RequestBody JSONObject user) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看用户个人搜索历史", httpMethod = "GET")
    @GetMapping(value = "/histories")
    public List<JSONObject> listUserHistory() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "查看用户个人浏览足迹", httpMethod = "GET")
    @GetMapping(value = "/footprints")
    public List<JSONObject> listUserFootprint() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "查看用户个人收藏夹", httpMethod = "GET")
    @GetMapping(value = "/favorites")
    public List<JSONObject> listUserFavorites() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "创建新搜索历史", httpMethod = "POST")
    @PostMapping(value = "/histories")
    public JSONObject insertHistory(@RequestBody JSONObject history) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建新收藏", httpMethod = "POST")
    @PostMapping(value = "/favorites")
    public JSONObject insertFavorites(@RequestBody JSONObject favorites) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建新浏览足迹", httpMethod = "POST")
    @PostMapping(value = "/footprints")
    public JSONObject insertFootprint(@RequestBody JSONObject footprint) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "清空用户的搜索历史", httpMethod = "DELETE")
    @DeleteMapping(value = "/histories")
    public boolean deleteHistory() {
        return true;
    }

    @ApiOperation(value = "清空用户的浏览足迹", httpMethod = "DELETE")
    @DeleteMapping(value = "/footprints")
    public boolean deleteFootprint() {
        return true;
    }

    @ApiOperation(value = "清空用户的收藏夹", httpMethod = "DELETE")
    @DeleteMapping(value = "/favorites")
    public boolean deleteFavorites() {
        return true;
    }

    @ApiOperation(value = "删除用户收藏夹的某商品", httpMethod = "DELETE")
    @DeleteMapping(value = "/favorites/{id}")
    public boolean deleteOneFavorites(@PathVariable(value = "id") Long goodId) {
        return true;
    }

    @ApiOperation(value = "删除用户浏览足迹的某一条", httpMethod = "DELETE")
    @DeleteMapping(value = "/footprints/{id}")
    public boolean deleteOneFootprint(@PathVariable(value = "id") Long goodId) {
        return true;
    }

    @ApiOperation(value = "删除用户搜索历史的某一条", httpMethod = "DELETE")
    @DeleteMapping(value = "/histories/{id}")
    public boolean deleteOneHistory(@PathVariable(value = "id") Long goodId) {
        return true;
    }

    @ApiOperation(value = "新建评论", httpMethod = "POST")
    @PostMapping(value = "/comments")
    public JSONObject insertComment(@RequestBody JSONObject comment) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除评论", httpMethod = "DELETE")
    @DeleteMapping(value = "/comments/{id}")
    public boolean deleteComment(@PathVariable(value = "id") Long commentId) {
        return true;
    }

    @ApiOperation(value = "查看用户个人订单", httpMethod = "GET")
    @GetMapping(value = "/orders")
    public List<JSONObject> getOrderId() {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "用户查看某状态(已支付未支付)的order信息",httpMethod = "GET")
    @GetMapping(value = "/orders/status")
    public List<JSONObject> getUserOrderByStatus(@RequestParam(value = "status")String orderStatus){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "创建新订单", httpMethod = "POST")
    @PostMapping(value = "/orders")
    public JSONObject insertOrder(@RequestBody JSONObject order) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除某订单", httpMethod = "DELETE")
    @DeleteMapping(value = "/orders/{id}")
    public boolean deleteUserOrder(@PathVariable(value = "id") Long orderId) {
        return true;
    }

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

    @ApiOperation(value = "查看用户个人购物车", httpMethod = "GET")
    @GetMapping(value = "/cart-items")
    public List<JSONObject> getUserCartItems() {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "向用户个人购物车添加商品", httpMethod = "POST")
    @PostMapping(value = "/cart-items/{id}")
    public JSONObject insertUserCartItems(@PathVariable(value = "id")Long goodId) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "修改用户个人购物车商品数量", httpMethod = "PUT")
    @PutMapping(value = "/cart-items/{id}")
    public JSONObject updateUserCartItems(@PathVariable(value = "id")Long goodId) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除用户个人购物车的某商品", httpMethod = "DELETE")
    @DeleteMapping(value = "/cart-items/{id}")
    public boolean deleteUserCartItems(@PathVariable(value = "id") Long goodId) {
        return true;
    }
}
