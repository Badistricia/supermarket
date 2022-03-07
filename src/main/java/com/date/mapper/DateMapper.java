package com.date.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.date.model.DateModel;

@Mapper
public interface DateMapper {
	@Insert("insert into date(id,name,outdate,indate) value(#{id},#{name},#{outdate},#{indate})")
	int insert(DateModel model);	
	@Delete("delete from date where id = #{id}")
	int delete(DateModel model);
	@Update("update date set name = #{name},outdate = #{outdate} ,indate = #{indate} where id = #{id}")
	int update(DateModel model);
	@Select("select id,name,outdate,indate from date where id like #{id} and name like #{name}")//模糊查询
	List<DateModel> selectList(DateModel model);
	@Select("select id,name,outdate,indate from date where id = #{id}")//模糊查询
	DateModel selectModel(DateModel model);//查询返还多条记录会异常
}
