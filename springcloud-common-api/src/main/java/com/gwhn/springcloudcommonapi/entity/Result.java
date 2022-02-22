package com.gwhn.springcloudcommonapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author banxian
 * @date 2022/2/22 8:43
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Result {

    private int code;
    private String message;
    private Object result;
}
