import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz : ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz : ");
        int r = input.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Hatalı değer girdiniz.");
        } else {
            long combination = calculateCombination(n, r);
            System.out.println("C(" + n + "," + r + ") = " + combination);
        }

        input.close();
    }

    private static long calculateCombination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static long factorial(int number) {
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}