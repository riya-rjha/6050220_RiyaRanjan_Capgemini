package cg.demo.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "abes_customer")
public class Customer {

    @Id
    private int customer_id;
    private String customer_name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    public Customer() {}

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + "]";
    }
}