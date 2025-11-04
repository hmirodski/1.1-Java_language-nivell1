public class Strings extends Instruments{


    public Strings(String name, int price) {
        super(name, price);
    }

    static{
        System.out.println("Loading Strings class");
    };

    public void Play() {
       System.out.println("String instrument is playing");
    }
}
