import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu al
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        // Kullanıcıdan dizinin elemanlarını al
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            numbers[i] = input.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(numbers);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.print("Sıralama : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        input.close();
    }
}