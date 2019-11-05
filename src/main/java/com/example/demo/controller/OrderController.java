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
    @ApiOperation(value = "获取所有订单",httpMethod = "GET")
    @GetMapping(value = "order")
    public List<JSONObject> getOrderAll(){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过orderId获取订单信息",httpMethod = "GET")
    @GetMapping(value = "order/{orderId}")
    public JSONObject getOrderId(@PathVariable(value = "orderId")Long orderId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过order状态获取订单信息",httpMethod = "GET")
    @GetMapping(value = "order/status/{orderStatus}")
    public List<JSONObject> getOrderByStatus(@PathVariable(value = "orderStatus")Long orderStatus){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "用户查看某状态的order信息",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/order/status/{orderStatus}")
    public List<JSONObject> getUserOrderByStatus(@PathVariable(value = "userId")Long userId,@PathVariable(value = "orderStatus")Long orderStatus){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "用户查看某种类的order信息",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/order/type/{orderType}")
    public List<JSONObject> getUserOrderByType(@PathVariable(value = "userId")Long userId,@PathVariable(value = "orderType")Long orderType){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过用户id获取订单下的商品信息",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/order/{orderId}/orderItem/{orderItem}")
    public JSONObject getOrderItem(@PathVariable (value = "userId")Long userId,@PathVariable(value = "orderId") Long orderId,@PathVariable(value = "orderItem") Integer orderItem){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过用户phone获取订单下的商品信息",httpMethod = "GET")
    @GetMapping(value = "user/phone/{userPhone}/order/{orderId}/orderItem/{orderItem}")
    public JSONObject getOrderItemByPhone(@PathVariable (value = "userPhone")Long userPhone,@PathVariable(value = "orderId") Long orderId,@PathVariable(value = "orderItem") Integer orderItem){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建某用户的新订单",httpMethod = "POST")
    @PostMapping(value="user/{userId}/order")
    public JSONObject insertOrder(@PathVariable (value = "userId")Long userId,@RequestBody JSONObject order){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除某用户的某订单",httpMethod = "DELETE")
    @DeleteMapping(value = "user/{userId}/order/{orderId}")
    public boolean deleteUserOrder(@PathVariable (value = "userId")Long userId,@PathVariable(value = "orderId")Long orderId){
        return true;
    }

    @ApiOperation(value = "通过id删除订单",httpMethod = "DELETE")
    @DeleteMapping(value = "order/{orderId}")
    public boolean deleteOrder(@PathVariable(value = "orderId")Long orderId){
        return true;
    }
}
