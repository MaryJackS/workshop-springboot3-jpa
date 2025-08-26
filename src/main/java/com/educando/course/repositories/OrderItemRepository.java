package com.educando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.course.entities.OrderItem;
import com.educando.course.entities.pk.OrderItemPK;



public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
