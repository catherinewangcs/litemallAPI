package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "UserController")
public class UserController {
    @ApiOperation(value = "管理员通过用户id获取某用户地址信息", httpMethod = "GET")
    @GetMapping(value = "/admin/addresses/{id}")
    public List<JSONObject> getAddressById(@PathVariable(value = "id") Long userId) {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "管理员通过userPhone获取用户地址信息", httpMethod = "GET")
    @GetMapping(value = "/admin/addresses/search")
    public List<JSONObject> getAddressByPhone(@RequestParam(value = "phone") String userPhone) {
        List<JSONObject> objects = new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "管理员通过用户id获取用户详细信息", httpMethod = "GET")
    @GetMapping(value = "/admin/users/{id}")
    public JSONObject getUserId(@PathVariable(value = "id") Long userId) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员通过用户name或者phone获取用户信息", httpMethod = "GET")
    @GetMapping(value = "/admin/users/search")
    public JSONObject getUserName(@RequestParam(value = "name") String userName, @RequestParam(value = "phone") String userPhone) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员更改用户个人信息", httpMethod = "PUT")
    @PutMapping(value = "/admin/users/{id}/info")
    public JSONObject adminUpdateUser(@PathVariable(value = "id") Long userId, @RequestBody JSONObject user) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用某用户", httpMethod = "DELETE")
    @DeleteMapping(value = "/admin/users/{id}")
    public boolean deleteUser(@PathVariable(value = "id") Long userId) {
        return true;
    }

    @ApiOperation(value = "管理员新建用户", httpMethod = "POST")
    @PostMapping(value = "/admin/users")
    public JSONObject insertUser(@RequestBody JSONObject user) {
        JSONObject object = new JSONObject();
        return object;
    }

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

    @ApiOperation(value = "查看用户个人收藏夹", httpMethod = "GET")
    @GetMapping(value = "/favorites")
    public List<JSONObject> listUserFavorites() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "用户创建新收藏", httpMethod = "POST")
    @PostMapping(value = "/favorites")
    public JSONObject insertFavorites(@RequestBody JSONObject favorites) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "用户清空个人的收藏夹", httpMethod = "DELETE")
    @DeleteMapping(value = "/favorites")
    public boolean deleteFavorites() {
        return true;
    }

    @ApiOperation(value = "删除用户收藏夹的某商品", httpMethod = "DELETE")
    @DeleteMapping(value = "/favorites/{id}")
    public boolean deleteOneFavorites(@PathVariable(value = "id") Long goodId) {
        return true;
    }

    @ApiOperation(value = "管理员查看某用户收藏夹",httpMethod = "GET")
    @GetMapping(value = "/admin/users/{id}/favorites")
    public List<JSONObject> listUserFavorites(@PathVariable(value = "id")Long userId){
        return new ArrayList<>();
    }


}
