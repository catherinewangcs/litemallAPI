package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "OrderController")
public class OrderController {
    @ApiOperation(value = "用户查看用户个人订单", httpMethod = "GET")
    @GetMapping(value = "/orders")
    public List<JSONObject> getOrderId() {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "用户查看某状态(已支付未支付)的order信息",httpMethod = "GET")
    @GetMapping(value = "/orders/search")
    public List<JSONObject> getUserOrderByStatus(@RequestParam(value = "status")String orderStatus){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "用户创建新订单", httpMethod = "POST")
    @PostMapping(value = "/orders")
    public JSONObject insertOrder(@RequestBody JSONObject order) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "用户删除某订单", httpMethod = "DELETE")
    @DeleteMapping(value = "/orders/{id}")
    public boolean deleteUserOrder(@PathVariable(value = "id") Long orderId) {
        return true;
    }

    @ApiOperation(value = "管理员通过orderId获取订单信息",httpMethod = "GET")
    @GetMapping(value = "/orders/{id}")
    public JSONObject getOrderId(@PathVariable(value = "id")Long orderId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员查找某状态的order",httpMethod = "GET")
    @GetMapping(value = "/admin/orders/search")
    public List<JSONObject> adminGetUserOrderByStatus(@RequestParam(value = "status")String orderStatus){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }
}
