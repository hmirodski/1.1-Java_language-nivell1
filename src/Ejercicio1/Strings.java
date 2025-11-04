package Ejercicio1;

public class Strings extends Instruments{


    public Strings(String name, int price) {
        super(name, price);
    }

    static void Strings_static_method(){
        System.out.println("Ejercicio1.Strings static method");
    }

    static{
        System.out.println("Loading Ejercicio1.Strings class");
    };

    public void Play() {
       System.out.println("String instrument is playing");
    }
}
