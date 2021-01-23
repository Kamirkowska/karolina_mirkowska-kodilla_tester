package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static List<Order> orderList = new ArrayList<>();

    public void addOrder(String orderNumber) {
        Order order = new Order(orderNumber);
        orderList.add(order);
    }

    public Order getOrder(String number) throws Exception {
        return orderList
                .stream()
                .filter(o -> o.getNumber().equals(number))
//                .findFirst().orElseThrow(OrderDoesntExistException::new);
                .findFirst().orElseThrow(()->new Exception("mój błąd"));
    }
}