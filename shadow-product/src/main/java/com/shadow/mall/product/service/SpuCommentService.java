package com.shadow.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shadow.common.utils.PageUtils;
import com.shadow.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 14:44:53
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

