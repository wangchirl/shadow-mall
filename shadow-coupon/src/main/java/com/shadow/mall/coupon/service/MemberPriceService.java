package com.shadow.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shadow.common.utils.PageUtils;
import com.shadow.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:13:19
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

