package com.admin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.admin.mapper.AdminMapper;
import com.admin.model.AdminModel;
import com.admin.service.IAdminService;

//第二种实现方式，定义impl，面对对象，在impl定义一个实现类，在service定义一个接口iAdminService，里面存放纯粹的抽象方法
@Service
public class AdminServiceimpl implements IAdminService{

	private AdminMapper mapper;
	public int insert(AdminModel model)
	{
		return mapper.insert(model);
	}
	
	public int delete(AdminModel model) {
		return mapper.delete(model);
	}
	
	public int update(AdminModel model) {
		return mapper.update(model);
	}
	
	public List<AdminModel> selectList(AdminModel model){
		return mapper.selectList(model);
	}
	
	public AdminModel selectModel(AdminModel model) {
		return mapper.selectModel(model);
	}
	
}
