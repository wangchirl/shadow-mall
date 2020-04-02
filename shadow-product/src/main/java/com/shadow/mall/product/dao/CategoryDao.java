package com.shadow.mall.product.dao;

import com.shadow.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 14:44:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
