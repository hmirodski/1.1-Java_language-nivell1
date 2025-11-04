package Ejercicio1;

abstract public class Instruments {

    private String name;
    int price;

    public Instruments(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    };


    static{
        System.out.println("Loading Ejercicio1.Instruments class");
    }

    public abstract void Play();


}
