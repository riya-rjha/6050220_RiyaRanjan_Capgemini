package cg.demo.dao;

import cg.demo.entity.Customer;
import cg.demo.entity.Order;
import jakarta.persistence.*;

import java.util.List;

public class DaoClient implements OrderDao {

    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("JPA-PU");

    private static EntityManager em = emf.createEntityManager();

    @Override
    public boolean addOrder(Order order, int custId) {
        Customer cust = em.find(Customer.class, custId);

        if (cust == null) return false;

        order.setCustomer(cust);

        em.getTransaction().begin();
        em.persist(order);
        em.getTransaction().commit();

        return true;
    }

    @Override
    public Order getOrder(int orderId) {
        return em.find(Order.class, orderId);
    }

    @Override
    public List<Order> getOrders(String custName) {
        String jpql = "SELECT o FROM Order o WHERE o.customer.customer_name = :custName";
        TypedQuery<Order> query =
                em.createQuery(jpql, Order.class);
        query.setParameter("custName", custName);
        return query.getResultList();
    }
}