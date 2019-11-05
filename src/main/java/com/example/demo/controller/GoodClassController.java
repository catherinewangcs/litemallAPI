package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "GoodClassController")
public class GoodClassController {
    @ApiOperation(value = "创建新品牌",httpMethod = "POST")
    @PostMapping(value="/brand")
    public JSONObject insertBrand(@RequestBody JSONObject brand){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建新专题",httpMethod = "POST")
    @PostMapping(value="/subject")
    public JSONObject insertSubject(@RequestBody JSONObject subject){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "创建新目录",httpMethod = "POST")
    @PostMapping(value="/category")
    public JSONObject insertCategory(@RequestBody JSONObject category){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "删除品牌",httpMethod = "DELETE")
    @DeleteMapping(value = "/brand/{brandId}")
    public boolean deleteBrand(@PathVariable (value = "brandId")Long brandId){
        return true;
    }

    @ApiOperation(value = "删除专题",httpMethod = "DELETE")
    @DeleteMapping(value = "/subject/{subjectId}")
    public boolean deleteSubject(@PathVariable (value = "subjectId")Long subjectId){
        return true;
    }

    @ApiOperation(value = "删除目录",httpMethod = "DELETE")
    @DeleteMapping(value = "/category")
    public boolean deleteCategory(@PathVariable (value = "categoryId")Long categoryId){
        return true;
    }

    @ApiOperation(value = "查看某品牌",httpMethod = "GET")
    @GetMapping(value = "/brand/{brandId}")
    public JSONObject getBrand(@PathVariable(value = "brandId")Long brandId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某专题",httpMethod = "GET")
    @GetMapping(value = "/subject/{subjectId}")
    public JSONObject getSubject(@PathVariable(value = "subjectId")Long subjectId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "查看某目录",httpMethod = "GET")
    @GetMapping(value = "/category/{categoryId}")
    public JSONObject getCategory(@PathVariable(value = "categoryId")Long categoryId){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改品牌信息",httpMethod = "PUT")
    @PutMapping(value = "/brand")
    public JSONObject updateBrand(@RequestBody JSONObject brand){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改种类信息",httpMethod = "PUT")
    @PutMapping(value = "/subject")
    public JSONObject updateSubject(@RequestBody JSONObject subject){
        JSONObject object=new JSONObject();
        return object;
    }

    @ApiOperation(value = "更改目录信息",httpMethod = "PUT")
    @PutMapping(value = "/category")
    public JSONObject updateCategory(@RequestBody JSONObject category){
        JSONObject object=new JSONObject();
        return object;
    }
}
