import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double r, a, alan, cevre, dilimAlani;

        System.out.print("Dairenin yarıçapını girin: ");
        r = input.nextDouble();

        System.out.print("Merkez açısını girin: ");
        a = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilimAlani = (pi * r * r * a) / 360;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Daire diliminin alanı: " + dilimAlani);

        input.close();
    }
}