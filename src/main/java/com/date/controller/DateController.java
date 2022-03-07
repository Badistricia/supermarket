package com.date.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.AdminModel;
import com.date.model.DateModel;
import com.date.service.DateService;
import com.github.pagehelper.PageInfo;

@RestController // = @Controller + @ ResponseBody //将返回过来的数据解析成普通文本返还到网页中，即json格式
@RequestMapping("date")//类上的requsetmapping中的内容在工程中不允许  重复
public class DateController {

	@Autowired//第一种方法
	private DateService service1;
	
	@RequestMapping("insert")//方法上的requsetmapping中的内容在当前文件其他方法中不可以  重复
	public Map<String, Object> insert(DateModel model) { //网页发来请求将数据返还回去
		System.out.println(model);
		Map<String,Object> map = new HashMap<>();
		map.put("code", service1.insert(model));
		return map;
	}
	@RequestMapping("delete")
	public Map<String, Object> delete(DateModel model) {
		int result = service1.delete(model);
		Map<String,Object> map = new HashMap<>();
		map.put("code", result);
		return map;
	}
	@RequestMapping("update")
	public Map<String, Object> update(DateModel model) {
		int result = service1.update(model);
		Map<String,Object> map = new HashMap<>();
		map.put("code", result);
		return map;
	}
	@RequestMapping("selectList")
	public Map<String, Object> selectList(DateModel model) {
		List<DateModel> result = service1.selectList(model);
		Map<String,Object> map = new HashMap<>();
		map.put("code", result);
		return map;
	}
	@RequestMapping("selectModel")
	public Map<String, Object> selectModel(DateModel model) {
		DateModel result = service1.selectModel(model);
		Map<String,Object> map = new HashMap<>();
		map.put("code", result);
		return map;
		
	}
	@RequestMapping("selectPage")
	public Map<String, Object> selectPage(DateModel model,int page,int limit) {
		PageInfo<DateModel> info = service1.selectPage(model,page,limit);
		Map<String,Object> map = new HashMap<>();
		map.put("code", "0");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}
	

}
