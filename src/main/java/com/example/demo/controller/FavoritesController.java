package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "FavoritesController")
public class FavoritesController {
    @ApiOperation(value = "通过userId获取用户收藏夹内容",httpMethod = "GET")
    @GetMapping(value = "user/{userId}/favoritesByUser")
    public JSONObject getFavoritesByUser(@PathVariable(value = "userId")Long userId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过goodId获取商品被收入的收藏夹",httpMethod = "GET")
    @GetMapping(value = "good/{goodId}/favoritesByGood")
    public JSONObject getFavoritesByGood(@PathVariable(value = "goodId")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除某用户的收藏夹全部内容",httpMethod = "DELETE")
    @DeleteMapping(value = "user/{userId}/favorites")
    public JSONObject deleteFavorites(@PathVariable(value = "userId")Long userId,@PathVariable(value = "favorites")boolean isDeleted){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除某用户的收藏夹单项内容",httpMethod = "DELETE")
    @DeleteMapping(value = "user/{userId}/favorites/{favoritesId}")
    public JSONObject deleteFavoritesById(@PathVariable(value = "userId")Long userId,@PathVariable(value = "favoritesId")Long favoritesId,@PathVariable(value = "favorites")boolean isDeleted){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建某用户新收藏夹",httpMethod = "POST")
    @PostMapping(value="user/{userId}/favorites")
    public JSONObject insertFavorites(@PathVariable(value = "userId")Long userId,@PathVariable(value = "favorites")Long favorites){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改某用户收藏夹信息",httpMethod = "PUT")
    @PutMapping(value = "user/{userId}/favorites")
    public JSONObject updateFavorites(@PathVariable(value = "userId")Long userId,@PathVariable(value = "favorites")Long favorites){
        JSONObject object=new JSONObject();
        return object;
    }
}
