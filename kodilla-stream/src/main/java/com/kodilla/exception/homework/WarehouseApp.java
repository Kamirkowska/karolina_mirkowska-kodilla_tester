package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws Exception {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder("25");
        warehouse.addOrder("33");
        warehouse.addOrder("13");
        warehouse.addOrder("4");

        try {
            Order isOrderNumberExist = warehouse.getOrder("11");
            System.out.println("Order" + isOrderNumberExist);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order does not exist.");
        } finally {
            System.out.println("Thank you for using our system");
        }
    }
}