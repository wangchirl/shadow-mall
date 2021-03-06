package com.shadow.mall.member.dao;

import com.shadow.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author shadow
 * @email shadow163@gmail.com
 * @date 2020-04-01 16:14:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
