import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("Girilen Sayı : ");
        int n = input.nextInt();

        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MAX_VALUE;
        int closestMin = -1;
        int closestMax = -1;

        // Dizideki elemanları kontrol et
        for (int i : list) {
            if (i < n && (n - i) < minDiff) {
                minDiff = n - i;
                closestMin = i;
            }
            if (i > n && (i - n) < maxDiff) {
                maxDiff = i - n;
                closestMax = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestMax);
    }
}