package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;
import com.imooc.order.repository.OrderDetailRepository;
import com.imooc.order.repository.OrderMasterRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 29  7:02 PM
 **/
public class OrderServiceImpl implements OrderService{


    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO save(@NonNull OrderDTO orderDTO) {

        return null;
    }

}
