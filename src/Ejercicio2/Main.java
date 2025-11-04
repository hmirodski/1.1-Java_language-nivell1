package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Car.brake();

        Car mustang = new Car(300);
        mustang.accelerate();

        Car bronco = new Car(500);
        bronco.accelerate();
    }
}
