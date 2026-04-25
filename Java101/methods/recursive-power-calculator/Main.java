import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();

        int result = power(base, exponent);

        System.out.println("Sonuç: " + result);

        input.close();
    }

    // Recursive power calculation
    private static int power(int base, int exponent) {
        // Base case: any number to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Recursive case: base^exponent = base * base^(exponent-1)
        return base * power(base, exponent - 1);
    }
}