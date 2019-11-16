package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@Api(tags = "CommonController")
public class CommonController {
    @ApiOperation(value = "通过商品id获取信息",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}")
    public JSONObject getGoods(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品名称获取信息",httpMethod = "GET")
    @GetMapping(value = "/goods/name")
    public JSONObject getGoodsByName(@RequestParam(value = "name")Long goodName){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某品牌下商品",httpMethod = "GET")
    @GetMapping(value = "/brands/{id}/goods")
    public JSONObject getBrand(@PathVariable(value = "id")Long brandId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某专题下商品",httpMethod = "GET")
    @GetMapping(value = "/subject/{id}/goods")
    public JSONObject getSubject(@PathVariable(value = "id")Long subjectId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某目录下商品",httpMethod = "GET")
    @GetMapping(value = "/category/{id}/goods")
    public JSONObject getCategory(@PathVariable(value = "id")Long categoryId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品id获取商品评论",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/comments")
    public List<JSONObject> getCommentByGood(@PathVariable(value = "id")Long goodId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过商品专题id获取商品评论",httpMethod = "GET")
    @GetMapping(value = "/subjects/{id}/comments")
    public List<JSONObject> getCommentBySubject(@PathVariable(value = "id")Long subjectId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看某商品不同评分的商品评论",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/comments/star/{star}")
    public List<JSONObject> getCommentByGoodStar(@PathVariable(value = "id")Long goodId,@PathVariable(value = "star")Long star){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过团购商品id获取该商品上的团购规则",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/groupon-rules")
    public JSONObject getGrouponRulesByGoods(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过团购商品名称获取该商品上的团购规则",httpMethod = "GET")
    @GetMapping(value = "/goods/name/groupon-rules")
    public JSONObject getGrouponRulesByGoodName(@RequestParam(value = "name")String goodName){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品id查看特定预售商品",httpMethod = "GET")
    @GetMapping(value = "/presale-goods/{id}")
    public JSONObject getPresaleGoods(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过名称查看特定预售商品",httpMethod = "GET")
    @GetMapping(value = "/presale-goods/name")
    public JSONObject getPresaleGoodsByName(@RequestParam(value = "name") String goodName){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品id查看商品分享规则",httpMethod = "GET")
    @GetMapping(value = "/share-rules/{id}")
    public JSONObject getShareRules(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品名称查看商品分享规则",httpMethod = "GET")
    @GetMapping(value = "/share-rules/name")
    public JSONObject getShareRulesByName(@RequestParam(value = "name") String goodName){
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
