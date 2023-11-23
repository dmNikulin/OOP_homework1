package oop.sem_01;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    List<Product> productList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productList)
            if(item.getName().equals(name))
                return item;
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product i : productList) {
            if ((i.getName().equals(name)) && 
                ((BottleOFWater) i).getVolume() == volume && 
                ((HotDrink) i).getTemperature() == temperature){

                return i;
            }
        }
        return null;
    }

    public Product getProductTemperature(int temperature) {
        for (Product i : productList) {
            if( ((HotDrink) i).getTemperature() == temperature){
                return i;
            }
        }
         return null;
    }
    
}
