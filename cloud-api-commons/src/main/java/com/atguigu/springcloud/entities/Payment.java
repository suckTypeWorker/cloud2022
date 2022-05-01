package com.atguigu.springcloud.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZY152
 * @create 2022/5/1 16:02
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
