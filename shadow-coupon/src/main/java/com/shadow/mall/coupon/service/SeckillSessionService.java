package com.shadow.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shadow.common.utils.PageUtils;
import com.shadow.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:13:19
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

