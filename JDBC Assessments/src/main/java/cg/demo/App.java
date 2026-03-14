package cg.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import cg.demo.dao.DaoClient;
import cg.demo.dao.OrderDao;
import cg.demo.entity.Order;

public class App {

    static Scanner scan = new Scanner(System.in);
    static OrderDao dao = new DaoClient();

    public static void main(String[] args) {
        String opt = null;

        do {
            System.out.println("1-ADD, 2--VIEW BY ORDER ID, 3--VIEW BY CUSTOMER NAME");
            int mtype = scan.nextInt();
            processMenu(mtype);

            System.out.println("Press y to continue");
            opt = scan.next();

        } while (opt.equalsIgnoreCase("y"));
    }

    public static void processMenu(int mtype) {

        switch (mtype) {

            case 1:
                addOrder();
                break;

            case 2:
                viewOrderByOrderID();
                break;

            case 3:
                viewOrdersByCustName();
                break;

            default:
                System.out.println("Invalid option");
        }
    }

    public static void addOrder() {

        Order order = new Order();

        System.out.println("Enter Order ID:");
        int oid = scan.nextInt();
        order.setOrder_id(oid);

        System.out.println("Enter date (yyyy-mm-dd):");
        String date = scan.next();
        order.setOrder_date(LocalDate.parse(date));

        System.out.println("Enter amount:");
        double val = scan.nextDouble();
        order.setOrder_amt(val);

        System.out.println("Enter Customer ID:");
        int cid = scan.nextInt();

        boolean flag = dao.addOrder(order, cid);

        if (flag)
            System.out.println("Order added successfully");
        else
            System.out.println("Order could not be added");
    }

    public static void viewOrderByOrderID() {

        System.out.println("Enter Order ID:");
        int oid = scan.nextInt();

        Order order = dao.getOrder(oid);

        if (order == null)
            System.out.println("Order not found");
        else
            System.out.println(order);
    }

    public static void viewOrdersByCustName() {

        System.out.println("Enter Customer Name:");
        String name = scan.next();

        List<Order> orders = dao.getOrders(name);

        if (orders.isEmpty())
            System.out.println("No orders found");
        else
            System.out.println(orders);
    }
}