import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, kdvOrani, kdvTutari, kdvliFiyat;

        System.out.print("Ürün tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = (tutar >= 0 && tutar <= 1000) ? 0.18 : 0.08;
        kdvTutari = tutar * kdvOrani;
        kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV Oranı: " + (kdvOrani * 100) + "%");
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);

        input.close();
    }
}