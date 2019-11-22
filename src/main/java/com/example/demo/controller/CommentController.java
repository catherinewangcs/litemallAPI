package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "CommentController")
public class CommentController {
    @ApiOperation(value = "用户新建评论", httpMethod = "POST")
    @PostMapping(value = "/comments")
    public JSONObject insertComment(@RequestBody JSONObject comment) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "用户删除评论", httpMethod = "DELETE")
    @DeleteMapping(value = "/comments/{id}")
    public boolean deleteComment(@PathVariable(value = "id") Long commentId) {
        return true;
    }

    @ApiOperation(value = "管理员通过评论id获取评论",httpMethod = "GET")
    @GetMapping(value = "/comments/{id}")
    public JSONObject getCommentById(@PathVariable(value = "id")Long commentId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员通过用户id获取用户评论",httpMethod = "GET")
    @GetMapping(value = "/users/{id}/comments")
    public List<JSONObject> getCommentByUser(@PathVariable(value = "id")Long userId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "管理员审核评论",httpMethod = "PUT")
    @PutMapping(value = "/comments/{id}")
    public JSONObject getCommentByState(@PathVariable(value = "id")Long commentId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员删除某评论",httpMethod = "DELETE")
    @DeleteMapping(value = "/admin/comments/{id}")
    public boolean adminDeleteComment(@PathVariable (value = "id")Long commentId){
        return true;
    }

    @ApiOperation(value = "通过商品id获取商品评论",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/comments")
    public List<JSONObject> getCommentByGood(@PathVariable(value = "id")Long goodId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过商品专题id获取商品评论",httpMethod = "GET")
    @GetMapping(value = "/topics/{id}/comments")
    public List<JSONObject> getCommentByTopic(@PathVariable(value = "id")Long topicId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看某商品不同评分的商品评论",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/comments/star/{star}")
    public List<JSONObject> getCommentByGoodStar(@PathVariable(value = "id")Long goodId,@PathVariable(value = "star")Long star){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

}
