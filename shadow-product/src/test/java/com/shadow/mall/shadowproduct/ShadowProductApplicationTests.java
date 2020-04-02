package com.shadow.mall.shadowproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shadow.mall.product.entity.BrandEntity;
import com.shadow.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShadowProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("成功");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("手机");
//        brandService.updateById(brandEntity);

        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id","1")).forEach(b -> {
            System.out.println(b.getName());
        });
    }

}
