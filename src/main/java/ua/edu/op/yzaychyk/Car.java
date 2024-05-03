package ua.edu.op.yzaychyk;

/**
 * @author YZaychyk
 * @since 1.0
 **/
public class Car {
    String brand;
    String model;
    int year;
    double fuelConsumption;

    public Car() {}

    public Car(int y, String m, String b, double fc) {
        brand = b;
        model = m;
        year = y;
        fuelConsumption = fc;
    }

    public Car(int year) {
        this.year = year;
    }

    public String getInfo() {
        return "Our car is: " + brand + "; Model: " + model + "; Year: " + year;
    }

    public double calculateConsupmption(double distance, double fuelPrice) {
        double fuelPer100km = (fuelConsumption / 100) * distance;
        return fuelPer100km * fuelPrice;
    }

    public static void main(String[] args) {
        Car firstCar = new Car(1997, "Corolla", "Toyota", 10.5);
        Car secondCar = new Car(2004, "Megane", "Renault", 23.7);
        Car empty = new Car();
        Car single = new Car(1989);
        double fuelPrice = 51.4;
        System.out.println(firstCar.getInfo());
        System.out.println(secondCar.getInfo());
        System.out.println("======================");
        System.out.println("Consumption for car1: " + firstCar.calculateConsupmption(30, fuelPrice));
        System.out.println("Consumption for car2: " + secondCar.calculateConsupmption(545.25, fuelPrice));
    }
}
