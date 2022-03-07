package com.admin.mapper;
import com.admin.model.AdminModel;

import java.util.*;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
// mapper是映射 

// 数据层-通过执行sql对于数据进行操作
//增删改查insert/delete/updata/select
//jdbc
//ORM
//spring-jdbc
//mybatis imp 
// xml //@注解（不是注释）

//the four things above all can make it;
@Mapper    
public interface AdminMapper {					//ibatis提供的类sql语句
	@Insert("insert into admin(id,name,pass) value(#{id},#{name},#{pass})")//类似于 （?,?,?），转换成标准的sql语句
	int insert(AdminModel model);	//model导入，将model内的信息导入id，name，pass
	
	@Delete("delete from admin where id = #{id}")
	int delete(AdminModel model);	
	
	@Update("update admin set name= #{name},pass= #{pass} where (id = #{id})")
	int update(AdminModel model);
	
	@Select("select id,name,pass from admin where id like #{id} and name like #{name}")//模糊查询
	List<AdminModel> selectList(AdminModel model);
	
	@Select("select id,name,pass from admin where id = #{id}")
	AdminModel selectModel(AdminModel model);//查询返还多条记录会异常
}
