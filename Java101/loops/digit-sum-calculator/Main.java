import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        int sum = calculateDigitSum(number);

        System.out.println("Basamak toplamı : " + sum);

        input.close();
    }

    private static int calculateDigitSum(int number) {
        int sum = 0;
        int tempNumber = Math.abs(number);

        while (tempNumber != 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }

        return sum;
    }
}