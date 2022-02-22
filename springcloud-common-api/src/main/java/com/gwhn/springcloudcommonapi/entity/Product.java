package com.gwhn.springcloudcommonapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author banxian
 * @date 2022/2/22 8:29
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Product {

    private Long id; //自增id
    private String name;// 产品名称
    private int stock;// 库存

}
