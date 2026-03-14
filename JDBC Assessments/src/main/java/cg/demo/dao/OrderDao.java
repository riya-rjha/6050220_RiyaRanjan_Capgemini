package cg.demo.dao;

import cg.demo.entity.Order;
import java.util.*;

public interface OrderDao {
    public boolean addOrder(Order order, int custId);
    public Order getOrder(int orderId);
    public List<Order> getOrders(String custName);
}
