package com.shadow.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shadow.common.utils.PageUtils;
import com.shadow.common.utils.Query;

import com.shadow.mall.product.dao.CategoryDao;
import com.shadow.mall.product.entity.CategoryEntity;
import com.shadow.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree(Map<String, Object> params) {
        // 1. 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 2. 组装成父子的树形结构
        // 2.1 找到一级分类
        List<CategoryEntity> level0 = entities.stream()
                .filter((item) -> item.getParentCid() == 0) // 找出一级菜单
                .map(menu -> { // 设置一级菜单的子菜单
                    menu.setChildren(getChildren(menu, entities));
                    return menu;
                })
                .sorted((m1, m2) -> {// 排序
                    return (m1.getSort() == null?0:m1.getSort()) - (m2.getSort()==null?0:m2.getSort());
                })
                .collect(Collectors.toList());

        return level0;
    }

    @Override
    public void remoteMenuByIds(List<Long> catIds) {
        //  TODO 1. 检查要删除的菜单是否被别的地方使用了
        // 业务中逻辑删除
        this.baseMapper.deleteBatchIds(catIds);
    }

    // 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> result = all.stream().filter((item) -> {
            return item.getParentCid() == root.getCatId(); // 当前遍历菜单的父id == 根菜单id
        }).map((menu) -> {
            // 找到子菜单 递归查找
            menu.setChildren(getChildren(menu, all));
            return menu;
            // 菜单排序
        }).sorted((m1, m2) -> {
            return (m1.getSort() == null?0:m1.getSort()) - (m2.getSort()==null?0:m2.getSort());
        }).collect(Collectors.toList());
        return result;
    }
}