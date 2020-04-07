package com.shadow.mall;

import com.shadow.common.valid.AddGroup;
import com.shadow.mall.product.entity.CategoryEntity;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 1. 整合 Mybatis-Plus
 *      1) 导入依赖
 *        <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *       2) 配置
 *          1. 配置数据源
 *              1) 导入mysql驱动
 *                  <dependency>
 *                      <groupId>mysql</groupId>
 *                      <artifactId>mysql-connector-java</artifactId>
 *                      <version>8.0.17</version>
 *                   </dependency>
 *               2) 配置数据源信息 application.yml
 *          2. 配置 Mybatis-Plus
 *              1) @Mapper扫码@MapperScan
 *              2) mapper.xml映射文件配置 application.yml
 *
 *  2. 逻辑删除
 *   1. 配置全局的逻辑删除规则
 *   2. 配置逻辑删除的组件bean
 *   3. 给bean加上逻辑删除注解@TableLogic
 *  mybatis-plus:
        global-config:
            db-config:
                id-type:auto # 自增主键
                logic-delete-value:1 # 逻辑删除值1
                logic-not-delete-value:0 # 逻辑删除值 0
    3. JSR303校验
        1.给Bean添加校验注解：javax.validation.constraints：设置错误信息 @URL @Pattern @NotNull 等
        2.开启校验功能 @Valid
        3. 分组校验[接口类型集合] @Validated(value = {AddGroup.class})  @NotNull(message = "msg",groups = {AddGroup.class})
        4. 使用分组校验注意，未指定分组的字段会被忽略
        5. 自定义校验
            1. 编写一个自定义的校验注解 ListValue.class ==>  ValidationMessages.properties
            2. 编写一个自定义的校验器 ListValueConstraintValidator.class
            3. 关联校验注解和校验器 @Constraint(validatedBy = { ListValueConstraintValidator.class})


    4. 统一异常处理
        1. @ControllerAdvice 集中处理 @ExceptionHandler ==> ShadowGlobalExceptionHandler.class
        3.校验参数后跟着 BindingResult 可以获取校验的结果信息 (@Valid @RequestBody CategoryEntity categoryEntity, BindingResult result)



 阿里云OSS使用：
 1. 引入oss-starter
 2. 配置 key，endpointer
 3. 使用OSSClient 进行相关操作
 *
 */
@SpringBootApplication
@MapperScan(value = "com.shadow.mall.product.dao")
@EnableDiscoveryClient

public class ShadowProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadowProductApplication.class, args);
    }


}
