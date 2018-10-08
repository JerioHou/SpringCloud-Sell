package cn.jerio.order.repository;


import cn.jerio.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
