package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ZY152
 * @create 2022/3/21 3:15
 * @description
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
