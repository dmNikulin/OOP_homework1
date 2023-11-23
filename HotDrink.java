package oop.sem_01;

public class HotDrink extends Product {
    private int temperature;
    private double volume;

    public HotDrink(String name, int cost, double volume, int temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return "Hot Drink{" +
                "name=" + super.getName() +
                ";cost=" + super.getCost() +
                ";volume=" + this.volume +
                ";temperature=" + this.temperature +'}';
    }

}
