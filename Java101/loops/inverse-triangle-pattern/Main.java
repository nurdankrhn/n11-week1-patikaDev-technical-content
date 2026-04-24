import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı : ");
        int steps = input.nextInt();

        for (int i = steps; i > 0; i--) {
            // Yıldızları basmak
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Yeni satıra geç
        }

        input.close();
    }
}