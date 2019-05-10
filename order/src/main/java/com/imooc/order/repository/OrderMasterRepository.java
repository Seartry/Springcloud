package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 29  6:18 PM
 **/
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

}
