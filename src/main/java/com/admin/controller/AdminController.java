package com.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.admin.model.AdminModel;
import com.admin.service.AdminService;
import com.admin.service.IAdminService;
//controller是处理请求

// 控制层 = 处理网页发来的请求（处理请求 
// 实现的三种方法
// servlet
// struts
// springmvc 要讲的方法

// ResponseBody指该类中所有的API接口返回的数据，甭管你对应的方法返回Map或是其他Object，它会以Json字符串的形式返回给客户端

//@controller  将当前修饰的类注入SpringBoot IOC容器，使得从该类所在的项目跑起来的过程中，这个类就被实例化。当然也有语义化的作用，即代表该类是充当Controller的作用
@RestController // = @Controller + @ ResponseBody //将返回过来的数据解析成普通文本返还到网页中，即json格式
@RequestMapping("admin")//类上的requsetmapping中的内容在工程中不允许  重复
public class AdminController {

	@Autowired//第一种方法
	private AdminService service1;
	@Autowired//第二种方法 impl方法
	private IAdminService service2;
	
	@RequestMapping("insert")//方法上的requsetmapping中的内容在当前文件其他方法中不可以  重复
	public Map<String, Object> insert(AdminModel model) { //网页发来请求将数据返还回去
		System.out.println(model);
		Map<String,Object> map = new HashMap<>();
		map.put("code", service1.insert(model));
		return map;
	}
	//http://127.0.0.1:8081/hotel210607/admin/insert?id=22&name=b&pass=3
	@RequestMapping("delete")
	public Map<String, Object> delete(AdminModel model) {
		System.out.println("delete success");
		Map<String,Object> map = new HashMap<>();
		map.put("code",service1.delete(model));
		return map;
	}
	//http://127.0.0.1:8081/hotel210607/admin/delete?id=a
	@RequestMapping("update")
	public Map<String, Object> update(AdminModel model) {
		Map<String,Object> map = new HashMap<>();
		map.put("code", service1.update(model));
		return map;
	}
	//http://127.0.0.1:8081/hotel210607/admin/updata?id=a&name=aa2
	@RequestMapping("selectList")
	public Map<String, Object> selectList(AdminModel model) {
		
		
		Map<String,Object> map = new HashMap<>();
		map.put("code", 0);
		map.put("data", service1.selectList(model));
		return map;
	}//http://127.0.0.1:8081/hotel210607/admin/select?id=a
	
	@RequestMapping("selectPage")
	public Map<String, Object> selectPage(AdminModel model,int page,int limit) {
		PageInfo<AdminModel> info = service1.selectPage(model,page,limit);
		Map<String,Object> map = new HashMap<>();
		map.put("code", "0");
		map.put("count", info.getTotal());
		map.put("data", info.getList());
		return map;
	}
	
	@RequestMapping("selectModel")
	public Map<String, Object> selectModel(AdminModel model) {
		AdminModel result = service1.selectModel(model);
		Map<String,Object> map = new HashMap<>();
		map.put("code", result);
		return map;
		
	}
	@RequestMapping("login")
	Map<String, Object> login(AdminModel model) {
		Map<String,Object> map = new HashMap<>();
		map.put("code", service1.login(model));
		return map;
		
	}
}
