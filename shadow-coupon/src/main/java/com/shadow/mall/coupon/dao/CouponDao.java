package com.shadow.mall.coupon.dao;

import com.shadow.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:13:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
