package com.goods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.goods.model.GoodsModel;

@Mapper
public interface GoodsMapper {
	@Insert("insert into goods(id,name,kind,number,price) value(#{id},#{name},#{kind},#{number},#{price})")
	int insert(GoodsModel model);	
	@Delete("delete from goods where id = #{id}")
	int delete(GoodsModel model);
	@Update("update goods set name =#{name},kind =#{kind},number =#{number},price = #{price} where id = #{id}")
	int update(GoodsModel model);
	@Select("select id,name,kind,number,price from goods where id like #{id} and name like #{name}")//模糊查询
	List<GoodsModel> selectList(GoodsModel model);
	@Select("select id,name,kind,number,price from goods where id = #{id}")//模糊查询
	GoodsModel selectModel(GoodsModel model);//查询返还多条记录会异常
	
	
}
