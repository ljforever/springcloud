package com.gwhn.springcloudproductprovider8100.service;

import com.gwhn.springcloudcommonapi.entity.Product;

/**
 * @author banxian
 * @date 2022/2/22 8:40
 */
public interface ProductProviderService {
    /**
     * 查询
     * @param id
     * @return
     */
    public Product selectById(Long id);


    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteById(Long id);

    /**
     * 修改
     * @param id
     * @param name
     * @return
     */
    public int updateById(Long id, String name);

    /**
     * 新增
     * @param product
     * @return
     */
    public int insertOne(Product product);
}
