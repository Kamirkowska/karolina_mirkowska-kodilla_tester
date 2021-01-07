package com.kodilla.exception.homework;

import org.junit.Test;

public class WarehouseAppTestSuite {

    @Test (expected = OrderDoesntExistException.class)
    public void testIsOrderExists_withException() throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder("25");

        Order result = warehouse.getOrder("11");
    }
}