package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static List<Order> orderList = new ArrayList<>();

    public void addOrder(String orderNumber) {
        Order order = new Order(orderNumber);
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orderList
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
    }

    public static Order getOrderNumber(Order order) {
        for (Order yourOrderNumber : orderList) {
            if (yourOrderNumber.getNumber().equals(order.getNumber()))
                return yourOrderNumber;
        }

        return null;
    }
}