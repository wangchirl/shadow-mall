package com.shadow.mall.order.dao;

import com.shadow.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:09:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
