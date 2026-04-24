import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen 0'dan büyük bir sayı giriniz.");
        } else {
            double result = calculateHarmonicSeries(n);
            System.out.println("Harmonik Seri Toplamı : " + result);
        }

        input.close();
    }

    private static double calculateHarmonicSeries(int n) {
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}