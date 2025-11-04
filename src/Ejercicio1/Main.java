package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Instruments flute = new Winds("flute", 300);
        flute.Play();

        Winds.Wind_static_method();


        Instruments Cello = new Strings("Cello", 100);
        Cello.Play();
        Strings.Strings_static_method();


        Instruments Drums = new Percussion("Drums", 200);
          Drums.Play();
        Percussion.Perc_static_method();
    }

}
