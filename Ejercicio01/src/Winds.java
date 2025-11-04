public class Winds extends Instruments{

    public Winds(String name, int price) {
        super(name, price);
    }

    static void Wind_static_method(){
        System.out.println("Winds static method");
    }

    static {
        System.out.println("Winds static method - no calling");
    }




    public void Play() {
        System.out.println("Wind instrument is playing");
    }
}
