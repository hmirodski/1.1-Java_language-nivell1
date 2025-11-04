abstract public class Instruments {

    String name;
    int price;

    public Instruments(String name, int price) {
        this.name = name;
        this.price = price;
    }

    static{
        System.out.println("Loading Instruments class");
    }

    public abstract void Play();


}
