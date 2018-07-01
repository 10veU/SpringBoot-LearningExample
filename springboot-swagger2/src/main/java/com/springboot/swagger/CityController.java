package com.springboot.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.CityModel;
@Api(value="城市信息管理服务")
@RequestMapping(value="/cities")
@RestController
public class CityController {
	Map<String, Object>  map = new HashMap<String, Object>();
	CityModel cityModel = new CityModel("71000","西安","二线","9983平方公里");
	List<CityModel> cityInfoList = new ArrayList<CityModel>();
	{	
		String postCode = "71000";
		map.put(postCode, cityModel);
	}
	@ApiOperation(value = "查询城市信息",notes = "通过邮政编码查询对应城市信息")
	@ApiImplicitParam(name = "postCode",value = "所查询城市的邮政编码",required = true, dataType = "String", paramType="path")
	@GetMapping(value = "/findCityInfo/{postCode}")
	public CityModel findCityInfo(@PathVariable String postCode){
		CityModel cityModel =(CityModel) map.get(postCode);
		return cityModel;
	}
	@ApiOperation(value = "添加城市信息",notes = "添加城市信息")
	@ApiImplicitParam(name = "cityModelInfo",value = "所添加城市的具体信息",required = true, dataType = "CityModel", paramType="body")
	@ApiResponse(code = 200, message = "添加成功")
	@PostMapping(value = "/addCityInfo")
	public String addCityInfo(@RequestBody CityModel cityModelInfo){
		cityInfoList.add(cityModelInfo);
		return "SUCCESS";
	}
	@ApiOperation(value = "更新城市信息",notes = "根据邮政编码更新城市信息")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "postCode", value = "邮政编码",required = true, dataType = "String", paramType = "path" ),
		@ApiImplicitParam(name = "cityModel",value = "所添加城市的具体信息",required = true, dataType = "CityModel", paramType="body")})
	@PutMapping(value = "/updateCityInfo/{postCode}/cityInfo")
	public CityModel updateCityInfo(@PathVariable String postCode,@RequestBody CityModel cityModel){
		CityModel cityUpdateModel =(CityModel) map.get(postCode);
		cityUpdateModel.setCityLevel("一线");
		return cityUpdateModel;
	}
	@ApiOperation(value = "删除城市信息",notes = "通过邮政编码删除对应城市信息")
	@ApiImplicitParam(name = "postCode",value = "所删除城市的邮政编码",required = true, dataType = "String", paramType="path")
	@ApiResponse(code = 200, message = "删除成功")
	@DeleteMapping(value = "/deleteCityInfo/{postCode}")
	public String deleteCityInfo(@PathVariable String postCode){
		cityInfoList.add(cityModel);
		cityInfoList.remove(0);
		return "SUCCESS";
	}
}
