package com.date.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.mapper.DateMapper;
import com.date.model.DateModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class DateService {
	@Autowired //依赖注入
	private DateMapper mapper;//接口
	//提供五种方法
	public int insert(DateModel model)
	{
		DateModel m0 = new DateModel();
		m0.setId(model.getId());
		DateModel mdb = mapper.selectModel(m0);
		if(mdb == null)
		{
		return mapper.insert(model);
		}
		else{
			return 9;}
	}
	
	public int delete(DateModel model) {
		return mapper.delete(model);
	}
	
	public int update(DateModel model) {
		return mapper.update(model);
	}
	
	public List<DateModel> selectList(DateModel model){
		String name = model.getName();
		model.setName(name==null ? "%%" : "%"+name+"%");
		String id = model.getId();
		model.setId(id==null ? "%%" : "%"+id+"%");
		return mapper.selectList(model);
	}
	
	public DateModel selectModel(DateModel model) {
		return mapper.selectModel(model);
	}
	
	public PageInfo<DateModel> selectPage(DateModel model, int page, int limit) {
		PageHelper.startPage(page,limit);
		List<DateModel> list = selectList(model);
		return new PageInfo<>(list);
		
	}
}
