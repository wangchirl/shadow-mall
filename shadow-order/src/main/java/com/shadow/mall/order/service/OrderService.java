package com.shadow.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shadow.common.utils.PageUtils;
import com.shadow.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:09:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

