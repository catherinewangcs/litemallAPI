package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "SearchHistoryController")
public class SearchHistoryController {
    @ApiOperation(value = "获取所有搜索历史",httpMethod = "GET")
    @GetMapping(value = "searchHistory")
    public JSONObject getSearchHistoryAll(@PathVariable(value = "searchHistory")Long searchHistory){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过userId获取搜索历史",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/searchHistory")
    public JSONObject getSearchHistoryById(@PathVariable(value = "userId")Long userId,@PathVariable(value = "searchHistory")Long searchHistory){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过关键字获取搜索历史",httpMethod = "GET")
    @GetMapping(value = "keyword/{keywordId}/searchHistory")
    public JSONObject getSearchHistoryByKeyword(@PathVariable(value = "keywordId")Long userId,@PathVariable(value = "searchHistory")Long searchHistory){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建某用户的新搜索历史",httpMethod = "POST")
    @PostMapping(value="user/{userId}/searchHistory")
    public JSONObject insertSearchHistory(@PathVariable (value = "userId")Long userId,@PathVariable(value = "searchHistory")Long searchHistory){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除某用户的某搜索历史",httpMethod = "DELETE")
    @DeleteMapping(value = "user/{userId}/searchHistory")
    public JSONObject deleteSearchHistory(@PathVariable (value = "userId")Long userId,@PathVariable(value = "searchHistory")boolean isDeleted){
        JSONObject object=new JSONObject();
        return object;
    }


}
