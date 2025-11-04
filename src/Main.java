public class Main {

    public static void main(String[] args) {

        Instruments flute = new Winds("flute", 300);
        flute.Play();

        Instruments Strings = new Strings("Cello", 100);
        Strings.Play();

        Instruments Percussion = new Percussion("Drums", 200);
        Percussion.Play();
    }

}
