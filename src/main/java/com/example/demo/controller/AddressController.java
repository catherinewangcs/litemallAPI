package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.vo.AddressVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "AddressController")
public class AddressController {
    @ApiOperation(value = "获取所有地址",httpMethod = "GET")
    @GetMapping(value = "address")
    public List<JSONObject> getAddressAll(){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过userId获取用户地址信息",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/address")
    public List<JSONObject> getAddressById(@PathVariable(value = "userId")Long userId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过userPhone获取用户地址信息",httpMethod = "GET")
    @GetMapping(value = "user/phone/{userPhone}/address")
    public List<JSONObject> getAddressByPhone(@PathVariable(value = "userPhone")Long userPhone){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "创建新地址",httpMethod = "POST")
    @PostMapping(value="address")
    public JSONObject insertAddress(@RequestBody JSONObject address){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改某用户的某地址信息",httpMethod = "PUT")
    @PutMapping(value = "user/{userId}/address")
    public JSONObject updateUser(@PathVariable(value = "userId")Long userId,@RequestBody JSONObject address){

        JSONObject object=new JSONObject();
        return object;
    }

//    @ApiOperation(value = "更改用户的某地址信息2",httpMethod = "POST")
//    @PutMapping(value = "user/address")
//    public JSONObject updateUser(@RequestBody AddressVO addressVO){
//        System.out.println(addressVO.getUserId()+" "+addressVO.getAddress());
//        return new JSONObject();
//    }

    @ApiOperation(value = "删除某用户的某地址",httpMethod = "DELETE")
    @DeleteMapping(value = "user/{userId}/address/{addressId}")
    public boolean deleteUserAddress(@PathVariable(value = "userId") Long userId,@PathVariable(value = "addressId") Long addressId){
        return true;
    }
}
