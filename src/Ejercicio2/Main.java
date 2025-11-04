package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Car.brake();

        Car mustang = new Car(300,"Mustang");
        mustang.accelerate();

        Car bronco = new Car(500, "Bronco");
        bronco.accelerate();

        Car f150 = new Car (150, "F150");
        f150.accelerate();
    }
}
