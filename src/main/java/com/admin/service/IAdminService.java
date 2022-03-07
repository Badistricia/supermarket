package com.admin.service;
import java.util.List;
import com.admin.model.AdminModel;

//抽象类定义，给impl链接
public interface IAdminService {

	int insert(AdminModel model);	
	
	
	int delete(AdminModel model);	
	
	
	int update(AdminModel model);
	
	
	List<AdminModel> selectList(AdminModel model);
	
	
	AdminModel selectModel(AdminModel model);
}
