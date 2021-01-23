package com.kodilla.exception.homework;

import org.junit.Test;

public class WarehouseAppTestSuite {

    @Test (expected = Exception.class)
    public void testIsOrderExists_withException() throws Exception {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder("25");

        Order result = warehouse.getOrder("11");
    }
}