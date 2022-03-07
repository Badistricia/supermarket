package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.mapper.AdminMapper;
import com.admin.model.AdminModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

// 业务层/服务层-具体功能业务逻辑
// 仅做一个简单业务逻辑
@Service// springframework提供的注解，很重要，
	/**
	 * 
	 * @param model
	 * @return 1=添加成功，9=账号重复
	 */
	

public class AdminService {
	@Autowired //依赖注入						//调用mapper的接口方法
	private AdminMapper mapper;//接口
	//提供五种方法
	public int insert(AdminModel model)
	{
		AdminModel m0 = new AdminModel();
		m0.setId(model.getId());
		AdminModel mdb = mapper.selectModel(m0);
		if(mdb == null)
		{
		return mapper.insert(model);
		}
		else{
			return 9;}
		
//		return selectModel(model) == null ? mapper.insert(model) :9;
	}
	
	public int delete(AdminModel model) {
		return mapper.delete(model);
	}
	
	public int update(AdminModel model) {
		return mapper.update(model);
	}
	
	public List<AdminModel> selectList(AdminModel model){
		String name = model.getName();
		model.setName(name==null ? "%%" : "%"+name+"%");
		String id = model.getId();
		model.setId(id==null ? "%%" : "%"+id+"%");
		return mapper.selectList(model);
	}
	
	public AdminModel selectModel(AdminModel model) {
		return mapper.selectModel(model);
	}

	public Object login(AdminModel model) {
		// TODO Auto-generated method stub
		AdminModel mdb = selectModel(model);
		if(mdb == null) {
			return 2;
		}if(mdb.getPass().equals(model.getPass())){
			return 1;
		}else {
			return 9;
		}
	}

	public PageInfo<AdminModel> selectPage(AdminModel model, int page, int limit) {
		PageHelper.startPage(page,limit);
		List<AdminModel> list = selectList(model);
		return new PageInfo<>(list);
		
	}
}
