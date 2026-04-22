import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;

        System.out.print("Armut Kaç Kilo ? :");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = input.nextDouble();

        toplam = (armutKg * armut) + (elmaKg * elma) + (domatesKg * domates)
                + (muzKg * muz) + (patlicanKg * patlican);

        System.out.println("Toplam Tutar : " + toplam + " TL");

        input.close();
    }
}