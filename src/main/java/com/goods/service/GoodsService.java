package com.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.date.model.DateModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goods.mapper.GoodsMapper;
import com.goods.model.GoodsModel;
@Service
public class GoodsService {
	@Autowired //依赖注入						//调用mapper的接口方法
	private GoodsMapper mapper;//接口
	//提供五种方法
	public int insert(GoodsModel model)
	{
		GoodsModel m0 = new GoodsModel();
		m0.setId(model.getId());
		GoodsModel mdb = mapper.selectModel(m0);
		if(mdb == null)
		{
		return mapper.insert(model);
		}
		else{
			return 9;}
	}
	
	public int delete(GoodsModel model) {
		return mapper.delete(model);
	}
	
	public int update(GoodsModel model) {
		return mapper.update(model);
	}
	
	public List<GoodsModel> selectList(GoodsModel model){
		String name = model.getName();
		model.setName(name==null ? "%%" : "%"+name+"%");
		String id = model.getId();
		model.setId(id==null ? "%%" : "%"+id+"%");
		return mapper.selectList(model);
	}
	
	public GoodsModel selectModel(GoodsModel model) {
		return mapper.selectModel(model);
	}
	public PageInfo<GoodsModel> selectPage(GoodsModel model, int page, int limit) {
		PageHelper.startPage(page,limit);
		List<GoodsModel> list = selectList(model);
		return new PageInfo<>(list);
		
	}
}
