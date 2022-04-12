package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZY152
 * @create 2022/3/20 21:10
 * @description
 */
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
