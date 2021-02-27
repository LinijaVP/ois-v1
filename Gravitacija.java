import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("Vpiši nadmorsko višino:");
        Scanner sc = new Scanner(System.in);
        int dolzina = sc.nextInt();

        double gravPospesek = izracun(dolzina);
        izpis(dolzina, gravPospesek);
    }

    public static void izpis(int visina, double gravPospesek) {
        System.out.printf("Na nadmorski višini %dm je gravitacijski pospešek %.3f", visina, gravPospesek);
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