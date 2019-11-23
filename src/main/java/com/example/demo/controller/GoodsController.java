package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(tags = "GoodsController")
public class GoodsController {
    @ApiOperation(value = "管理员更改品牌信息",httpMethod = "PUT")
    @PutMapping(value = "/brands")
    public JSONObject updateBrand(@RequestBody JSONObject brand){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员更改目录信息",httpMethod = "PUT")
    @PutMapping(value = "/categories")
    public JSONObject updateCategory(@RequestBody JSONObject category){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员更改专题信息",httpMethod = "PUT")
    @PutMapping(value = "/topics")
    public JSONObject updateTopic(@RequestBody JSONObject topic){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用品牌",httpMethod = "DELETE")
    @DeleteMapping(value = "/brands/{id}")
    public boolean deleteBrand(@PathVariable(value = "id")Long brandId){
        return true;
    }

    @ApiOperation(value = "管理员禁用专题",httpMethod = "DELETE")
    @DeleteMapping(value = "/admin/topics/{id}")
    public boolean deleteTopic(@PathVariable (value = "id")Long topicId){
        return true;
    }

    @ApiOperation(value = "管理员禁用目录",httpMethod = "DELETE")
    @DeleteMapping(value = "/admin/categories/{id}")
    public boolean deleteCategory(@PathVariable (value = "id")Long categoryId){
        return true;
    }

    @ApiOperation(value = "管理员创建新品牌",httpMethod = "POST")
    @PostMapping(value="/brands")
    public JSONObject insertBrand(@RequestBody JSONObject brand){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员创建新目录",httpMethod = "POST")
    @PostMapping(value="/categories")
    public JSONObject insertCategory(@RequestBody JSONObject category){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员创建新专题",httpMethod = "POST")
    @PostMapping(value="/topics")
    public JSONObject insertTopic(@RequestBody JSONObject topic){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员新建某商品",httpMethod = "POST")
    @PostMapping(value = "/goods")
    public JSONObject insertGood(@RequestBody JSONObject good){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用某商品",httpMethod = "DELETE")
    @DeleteMapping(value = "/goods/{id}")
    public boolean deleteGood(@PathVariable(value = "id")Long goodId){
        return true;
    }

    @ApiOperation(value = "管理员更改商品信息(包括上下架状态)",httpMethod = "PUT")
    @PutMapping(value = "/goods")
    public JSONObject updateGood(@RequestBody JSONObject good){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员新建预售商品", httpMethod = "POST")
    @PostMapping(value = "/presale-goods")
    public JSONObject insertPresaleGoods(@RequestBody JSONObject presaleGoods) {
        JSONObject object = new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员修改某个预售商品",httpMethod = "PUT")
    @PutMapping(value = "/presale-goods")
    public JSONObject updatePresaleGoods(@RequestBody JSONObject presaleGoods){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用一个预售商品",httpMethod = "DELETE")
    @DeleteMapping(value = "/presale-goods/{id}")
    public boolean deletePresaleGoods(@PathVariable(value = "id")Long presaleGoodsId){
        return true;
    }

    @ApiOperation(value = "通过商品id获取商品信息",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}")
    public JSONObject getGoods(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过商品名称获取商品信息",httpMethod = "GET")
    @GetMapping(value = "/goods/search")
    public JSONObject getGoodsByName(@RequestParam(value = "name")Long goodName){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某品牌下商品",httpMethod = "GET")
    @GetMapping(value = "/brands/{id}/goods")
    public List<JSONObject> getBrand(@PathVariable(value = "id")Long brandId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看某目录下商品",httpMethod = "GET")
    @GetMapping(value = "/categories/{id}/goods")
    public List<JSONObject> getCategory(@PathVariable(value = "id")Long categoryId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看某目录下子目录",httpMethod = "GET")
    @GetMapping(value = "/categories/{id}/childs")
    public List<JSONObject> getCategoryChilds(@PathVariable(value = "id")Long categoryId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看某专题下商品",httpMethod = "GET")
    @GetMapping(value = "/topics/{id}/goods")
    public List<JSONObject> getTopic(@PathVariable(value = "id")Long topicId){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "通过商品id查看特定预售商品",httpMethod = "GET")
    @GetMapping(value = "/presale-goods/{id}")
    public JSONObject getPresaleGoods(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "通过名称查看特定预售商品",httpMethod = "GET")
    @GetMapping(value = "/presale-goods/search")
    public JSONObject getPresaleGoodsByName(@RequestParam(value = "name") String goodName){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某商品下所有产品",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/products")
    public JSONObject getGoodProducts(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员新建某商品下的产品",httpMethod = "POST")
    @PostMapping(value = "/goods/{id}/products")
    public JSONObject insertGoodProduct(@PathVariable(value = "id")Long goodId,@RequestBody JSONObject product){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "管理员禁用某商品下的某产品",httpMethod = "DELETE")
    @DeleteMapping(value = "/goods/{id}/products/{pid}")
    public boolean deleteGoodProducts(@PathVariable(value = "id")Long goodId,@PathVariable(value = "pid")Long productId){
        return true;
    }

    @ApiOperation(value = "管理员更改某商品下某产品信息",httpMethod = "PUT")
    @PutMapping(value = "/goods/{id}/products")
    public JSONObject updateGoodProducts(@PathVariable(value = "id")Long goodId,@RequestBody JSONObject product){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "从某商品查看其品牌",httpMethod = "GET")
    @GetMapping(value = "/goods/{id}/brands")
    public JSONObject getGoodBrands(@PathVariable(value = "id")Long goodId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看上新商品",httpMethod = "GET")
    @GetMapping(value = "/goods/new")
    public List<JSONObject> getNewGoods(){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }

    @ApiOperation(value = "查看人气商品",httpMethod = "GET")
    @GetMapping(value = "/goods/hot")
    public List<JSONObject> getHotGoods(){
        List<JSONObject> objects=new ArrayList<>();
        return objects;
    }
}
