package com.shadow.mall.member.feign;

import com.shadow.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "shadowmall-coupon")
public interface CouponService {

    @RequestMapping("/coupon/coupon/coupon/member/list")
    public R memberCoupons();
}
