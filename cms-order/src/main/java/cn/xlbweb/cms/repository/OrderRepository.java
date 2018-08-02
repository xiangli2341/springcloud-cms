package cn.xlbweb.cms.repository;

import cn.xlbweb.cms.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author: bobi
 * @date: 2018/7/31 15:47
 * @description:
 */
public interface OrderRepository extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {
}
