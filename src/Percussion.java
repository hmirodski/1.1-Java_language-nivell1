public class Percussion extends Instruments{

    public Percussion(String name, int price) {
        super(name, price);
    }

    static{
        System.out.println("Loading Percussion class");
    }

    public void Play() {
        System.out.println("Percussion instrument is playing");
    }
}
