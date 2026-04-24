import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz : ");
        int limit = input.nextInt();

        System.out.println("4'ün kuvvetleri:");
        printPowers(limit, 4);

        System.out.println("5'in kuvvetleri:");
        printPowers(limit, 5);

        input.close();
    }

    private static void printPowers(int limit, int base) {
        for (int value = 1; value <= limit; value *= base) {
            System.out.println(value);
        }
    }
}