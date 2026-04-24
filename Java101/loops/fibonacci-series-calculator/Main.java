import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        System.out.println(n + " Elemanlı Fibonacci Serisi:");
        printFibonacci(n);

        input.close();
    }

    private static void printFibonacci(int n) {
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
    }
}