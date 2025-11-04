package Ejercicio1;

public class Percussion extends Instruments{

    public Percussion(String name, int price) {
        super(name, price);
    }

    static{
        System.out.println("Loading Ejercicio1.Percussion class");
    }

    static void Perc_static_method(){
        System.out.println("Ejercicio1.Percussion static method");
    }

    public void Play() {
        System.out.println("Ejercicio1.Percussion instrument is playing");
    }
}
