package com.luandev.entities;

import com.luandev.entitiesEnum.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private final OrderStatus status;
    List<OrderItem> items = new ArrayList<OrderItem>();

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() { return moment; }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public void totalPrice() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getQuantity() * item.getPrice();
        }
        System.out.println("Total price: " + total);
    }
}
