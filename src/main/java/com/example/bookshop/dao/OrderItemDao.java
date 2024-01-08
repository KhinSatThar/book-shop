package com.example.bookshop.dao;

import com.example.bookshop.entity.OrderItem;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDao extends JpaRepository<OrderItem,Integer> {
}
