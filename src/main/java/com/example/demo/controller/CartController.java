package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CartController {
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
