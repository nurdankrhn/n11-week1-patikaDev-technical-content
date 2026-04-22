import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, acilisUcreti = 10.0, kmBasiUcret = 2.20, tutar;

        System.out.print("Gidilen mesafeyi km cinsinden girin: ");
        km = input.nextDouble();

        tutar = acilisUcreti + (km * kmBasiUcret);
        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Toplam taksimetre tutarı: " + tutar + " TL");

        input.close();
    }
}