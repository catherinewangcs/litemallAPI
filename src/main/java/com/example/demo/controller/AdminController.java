package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "AdminController")
public class AdminController {
    @ApiOperation(value = "通过用户id获取某用户地址信息",httpMethod = "GET")
    @GetMapping(value = "/addresses/{id}")
    public List<JSONObject> getAddressById(@PathVariable(value = "id")Long userId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过userPhone获取用户地址信息",httpMethod = "GET")
    @GetMapping(value = "/addresses/search")
    public List<JSONObject> getAddressByPhone(@RequestParam(value = "phone")String userPhone){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "管理员登陆",httpMethod = "POST")
    @PostMapping(value = "/admin/login")
    public JSONObject getUserIdPassword(@RequestParam(value = "adminId")Long adminId, @RequestParam(value = "password")Long password){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过用户id获取用户详细信息",httpMethod = "GET")
    @GetMapping(value = "/users/{id}")
    public JSONObject getUserId(@PathVariable(value = "id")Long userId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过用户name或者phone获取用户信息",httpMethod = "GET")
    @GetMapping(value = "/users/search")
    public JSONObject getUserName(@RequestParam(value = "name")String userName,@RequestParam(value = "phone")String userPhone){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改用户个人信息",httpMethod = "PUT")
    @PutMapping(value = "/users/{id}/info")
    public JSONObject updateUser(@PathVariable(value = "id")Long userId,@RequestBody JSONObject user){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "禁用某用户",httpMethod = "DELETE")
    @DeleteMapping(value = "/users/{id}")
    public boolean deleteUser(@PathVariable(value = "id")Long userId){
        return true;
    }

    @ApiOperation(value = "新建用户",httpMethod = "POST")
    @PostMapping(value = "/users")
    public JSONObject insertUser(@RequestBody JSONObject user){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改品牌信息",httpMethod = "PUT")
    @PutMapping(value = "/brands")
    public JSONObject updateBrand(@RequestBody JSONObject brand){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改种类信息",httpMethod = "PUT")
    @PutMapping(value = "/subjects")
    public JSONObject updateSubject(@RequestBody JSONObject subject){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改目录信息",httpMethod = "PUT")
    @PutMapping(value = "/categories")
    public JSONObject updateCategory(@RequestBody JSONObject category){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "禁用品牌",httpMethod = "DELETE")
    @DeleteMapping(value = "/brands/{id}")
    public boolean deleteBrand(@PathVariable (value = "id")Long brandId){
        return true;
    }

    @ApiOperation(value = "禁用专题",httpMethod = "DELETE")
    @DeleteMapping(value = "/subjects/{id}")
    public boolean deleteSubject(@PathVariable (value = "id")Long subjectId){
        return true;
    }

    @ApiOperation(value = "禁用目录",httpMethod = "DELETE")
    @DeleteMapping(value = "/categories/{id}")
    public boolean deleteCategory(@PathVariable (value = "id")Long categoryId){
        return true;
    }

    @ApiOperation(value = "创建新品牌",httpMethod = "POST")
    @PostMapping(value="/brands")
    public JSONObject insertBrand(@RequestBody JSONObject brand){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建新专题",httpMethod = "POST")
    @PostMapping(value="/subjects")
    public JSONObject insertSubject(@RequestBody JSONObject subject){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建新目录",httpMethod = "POST")
    @PostMapping(value="/categories")
    public JSONObject insertCategory(@RequestBody JSONObject category){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某用户搜索历史",httpMethod = "GET")
    @GetMapping(value = "/users/{id}/histories")
    public List<JSONObject> listUserHistory(@PathVariable(value = "id") Long userId){
        return new ArrayList<>();
    }

    @ApiOperation(value = "查看某用户浏览足迹",httpMethod = "GET")
    @GetMapping(value = "/users/{id}/footprints")
    public List<JSONObject> listUserFootprint(@PathVariable(value = "id")Long userId){
        return new ArrayList<>();
    }

    @ApiOperation(value = "查看某用户收藏夹",httpMethod = "GET")
    @GetMapping(value = "/users/{id}/favorites")
    public List<JSONObject> listUserFavorites(@PathVariable(value = "id")Long userId){
        return new ArrayList<>();
    }

    @ApiOperation(value = "通过评论id获取评论",httpMethod = "GET")
    @GetMapping(value = "/comments/{id}")
    public JSONObject getCommentById(@PathVariable(value = "id")Long commentId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过用户id获取用户评论",httpMethod = "GET")
    @GetMapping(value = "/users/{id}/comments")
    public List<JSONObject> getCommentByUser(@PathVariable(value = "id")Long userId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "审核评论",httpMethod = "PUT")
    @PutMapping(value = "/comments/{id}")
    public JSONObject getCommentByState(@PathVariable(value = "id")Long commentId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除评论",httpMethod = "DELETE")
    @DeleteMapping(value = "/admin/comments/{id}")
    public boolean deleteComment(@PathVariable (value = "id")Long commentId){
        return true;
    }

    @ApiOperation(value = "新建商品",httpMethod = "POST")
    @PostMapping(value = "/goods")
    public JSONObject insertGood(@RequestBody JSONObject good){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "禁用某商品",httpMethod = "DELETE")
    @DeleteMapping(value = "/goods/{id}")
    public boolean deleteGood(@PathVariable(value = "id")Long goodId){
        return true;
    }

    @ApiOperation(value = "更改商品信息(包括上下架状态)",httpMethod = "PUT")
    @PutMapping(value = "/goods")
    public JSONObject updateGood(@RequestBody JSONObject good){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过orderId获取订单信息",httpMethod = "GET")
    @GetMapping(value = "/orders/{id}")
    public JSONObject getOrderId(@PathVariable(value = "id")Long orderId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "新建一种优惠券",httpMethod = "POST")
    @PostMapping(value = "/coupon-rules")
    public JSONObject insertCouponRules(@RequestBody JSONObject couponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "禁用一种优惠券",httpMethod = "DELETE")
    @DeleteMapping(value = "/coupon-rules/{id}")
    public boolean deleteCoupon(@PathVariable(value = "id")Long couponRulesId){
        return true;
    }

    @ApiOperation(value = "更改一种优惠券信息",httpMethod = "PUT")
    @PutMapping(value = "/coupon-rules")
    public JSONObject updateCoupon(@RequestBody JSONObject couponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "新建团购规则",httpMethod = "POST")
    @PostMapping(value = "/groupon-rules")
    public JSONObject insertGrouponRules(@RequestBody JSONObject grouponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过团购规则id获取团购规则内容",httpMethod = "GET")
    @GetMapping(value = "/groupon-rules/{id}")
    public JSONObject getGrouponRules(@PathVariable(value = "id")Long grouponRulesId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "修改某团购规则内容",httpMethod = "PUT")
    @PutMapping(value = "/groupon-rules")
    public JSONObject updateGrouponRules(@RequestBody JSONObject grouponRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "禁用一个团购规则",httpMethod = "DELETE")
    @DeleteMapping(value = "/groupon-rules/{id}")
    public boolean deleteGrouponRules(@PathVariable(value = "id")Long grouponRulesId){
        return true;
    }

    @ApiOperation(value = "查找某状态的order",httpMethod = "GET")
    @GetMapping(value = "/admin/orders/search")
    public List<JSONObject> getUserOrderByStatus(@RequestParam(value = "status")String orderStatus){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "新建预售商品", httpMethod = "POST")
    @PostMapping(value = "/presale-goods")
    public JSONObject insertPresaleGoods(@RequestBody JSONObject presaleGoods) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "修改某个预售商品",httpMethod = "PUT")
    @PutMapping(value = "/presale-goods")
    public JSONObject updatePresaleGoods(@RequestBody JSONObject presaleGoods){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "禁用一个预售商品",httpMethod = "DELETE")
    @DeleteMapping(value = "/presale-goods/{id}")
    public boolean deletePresaleGoods(@PathVariable(value = "id")Long presaleGoodsId){
        return true;
    }

    @ApiOperation(value = "新建一个分享规则", httpMethod = "POST")
    @PostMapping(value = "/share-rules")
    public JSONObject insertShareRules(@RequestBody JSONObject shareRules) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "修改一个分享规则",httpMethod = "PUT")
    @PutMapping(value = "/share-rules")
    public JSONObject updateShareRules(@RequestBody JSONObject shareRules){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "禁用一个分享规则",httpMethod = "DELETE")
    @DeleteMapping(value = "/share-rules/{id}")
    public boolean deleteShareRules(@PathVariable(value = "id")Long shareRulesId){
        return true;
    }
}

