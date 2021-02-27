import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {

    }

    public static double izracun(int dolzina) {
        int polmer = 6371000;
        double masaZemlje = (5.972 * Math.pow(10.0 , 24.0));
        double gravKonstanta = (6.674 * Math.pow(10.0,-11.0));

        double gravPospesek = (gravKonstanta * masaZemlje) / 
            Math.pow(polmer + dolzina, 2.0);

        return gravPospesek;
    }
}