package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "PaymentController")
public class PaymentController {
    @ApiOperation(value = "用户支付订单",httpMethod = "POST")
    @PostMapping(value = "/order/{id}/payment")
    public JSONObject insertPayment(@PathVariable(value = "id")Long orderId){
        JSONObject object=new JSONObject();
        return object;
    }
}
