package com.shadow.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shadow.common.utils.PageUtils;
import com.shadow.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:14:57
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

