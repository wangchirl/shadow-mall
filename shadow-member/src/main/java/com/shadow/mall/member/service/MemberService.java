package com.shadow.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shadow.common.utils.PageUtils;
import com.shadow.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:14:57
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

