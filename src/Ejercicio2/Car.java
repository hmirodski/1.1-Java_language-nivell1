package Ejercicio2;

public class Car {
    static final String brand = "Ford";
    static String model = "Mustang";
    final int power;

    public Car(int power) {
        this.power = power;
    }

    static void brake(){
        System.out.println(brand + " " + model + " is pumping the brakes");
    }

    public void accelerate(){
        System.out.println(brand + " " + model +" is hitting the gas with " + power +  "HP");
    }
}
