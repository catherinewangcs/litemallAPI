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
    @ApiOperation(value = "新建评论",httpMethod = "POST")
    @PostMapping(value = "comment")
    public JSONObject insertComment(@RequestBody JSONObject comment){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除评论",httpMethod = "DELETE")
    @DeleteMapping(value = "comment/{commentId}")
    public boolean deleteComment(@PathVariable(value = "commentId")Long commentId){
        return true;
    }

    @ApiOperation(value = "获取所有评论",httpMethod = "GET")
    @GetMapping(value = "comment")
    public List<JSONObject> getCommentAll(){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }


    @ApiOperation(value = "通过评论id获取评论",httpMethod = "GET")
    @GetMapping(value = "comment/{commentId}")
    public JSONObject getCommentById(@PathVariable(value = "commentId")Long commentId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过用户id获取用户评论",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/comment")
    public List<JSONObject> getCommentByUser(@PathVariable(value = "userId")Long userId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过商品id获取商品评论",httpMethod = "GET")
    @GetMapping(value = "good/{goodId}/comment")
    public List<JSONObject> getCommentByGood(@PathVariable(value = "goodId")Long goodId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过商品专题id获取商品评论",httpMethod = "GET")
    @GetMapping(value = "subject/{subjectId}/comment")
    public List<JSONObject> getCommentBySubject(@PathVariable(value = "subjectId")Long subjectId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看某商品不同评分的商品评论",httpMethod = "GET")
    @GetMapping(value = "good/{goodId}/comment/star/{star}")
    public JSONObject getCommentByGoodStar(@PathVariable(value = "goodId")Long goodId,@PathVariable(value = "star")Long star){
        JSONObject object=new JSONObject();
        return object;
    }
}
