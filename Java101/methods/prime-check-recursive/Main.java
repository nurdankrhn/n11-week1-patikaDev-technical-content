import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        input.close();
    }

    // Recursive method to check if the number is prime
    private static boolean isPrime(int number, int divisor) {
        if (number <= 1) {
            return false;
        }
        if (divisor == number) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }
}