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
@Api(value="������Ϣ�������")
@RequestMapping(value="/cities")
@RestController
public class CityController {
	Map<String, Object>  map = new HashMap<String, Object>();
	CityModel cityModel = new CityModel("71000","����","����","9983ƽ������");
	List<CityModel> cityInfoList = new ArrayList<CityModel>();
	{	
		String postCode = "71000";
		map.put(postCode, cityModel);
	}
	@ApiOperation(value = "��ѯ������Ϣ",notes = "ͨ�����������ѯ��Ӧ������Ϣ")
	@ApiImplicitParam(name = "postCode",value = "����ѯ���е���������",required = true, dataType = "String", paramType="path")
	@GetMapping(value = "/findCityInfo/{postCode}")
	public CityModel findCityInfo(@PathVariable String postCode){
		CityModel cityModel =(CityModel) map.get(postCode);
		return cityModel;
	}
	@ApiOperation(value = "��ӳ�����Ϣ",notes = "��ӳ�����Ϣ")
	@ApiImplicitParam(name = "cityModelInfo",value = "����ӳ��еľ�����Ϣ",required = true, dataType = "CityModel", paramType="body")
	@ApiResponse(code = 200, message = "��ӳɹ�")
	@PostMapping(value = "/addCityInfo")
	public String addCityInfo(@RequestBody CityModel cityModelInfo){
		cityInfoList.add(cityModelInfo);
		return "SUCCESS";
	}
	@ApiOperation(value = "���³�����Ϣ",notes = "��������������³�����Ϣ")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "postCode", value = "��������",required = true, dataType = "String", paramType = "path" ),
		@ApiImplicitParam(name = "cityModel",value = "����ӳ��еľ�����Ϣ",required = true, dataType = "CityModel", paramType="body")})
	@PutMapping(value = "/updateCityInfo/{postCode}/cityInfo")
	public CityModel updateCityInfo(@PathVariable String postCode,@RequestBody CityModel cityModel){
		CityModel cityUpdateModel =(CityModel) map.get(postCode);
		cityUpdateModel.setCityLevel("һ��");
		return cityUpdateModel;
	}
	@ApiOperation(value = "ɾ��������Ϣ",notes = "ͨ����������ɾ����Ӧ������Ϣ")
	@ApiImplicitParam(name = "postCode",value = "��ɾ�����е���������",required = true, dataType = "String", paramType="path")
	@ApiResponse(code = 200, message = "ɾ���ɹ�")
	@DeleteMapping(value = "/deleteCityInfo/{postCode}")
	public String deleteCityInfo(@PathVariable String postCode){
		cityInfoList.add(cityModel);
		cityInfoList.remove(0);
		return "SUCCESS";
	}
}
