abstract public class Instruments {

    String name;
    int price;

    public Instruments(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract void Play();


}
