import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        int base = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        int exponent = input.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Cevap : " + result);

        input.close();
    }
}