package oop.sem_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("Gas", 120, 0.5, 38));
        productList.add(new HotDrink("Tea", 60, 0.33, 75));
        productList.add(new HotDrink("Coffee", 180, 0.33, 98));
        productList.add(new HotDrink("Hot wine", 120, 0.5, 74));

        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        hotDrinkMachine.initProduct(productList);

        System.out.println(hotDrinkMachine.getProduct("Gas"));
        System.out.println(hotDrinkMachine.getProductTemperature(75));


        // BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        // vendingMachine.initProduct(productList);

    }
}
