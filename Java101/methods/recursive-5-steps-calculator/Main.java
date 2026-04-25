import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = input.nextInt();

        // Recursive metot çağrısı
        recursiveStep(n);

        input.close();
    }

    // Recursive metot
    private static void recursiveStep(int number) {
        // Eğer sayı 0 veya negatifse 5 ekleyerek başla
        System.out.print(number + " ");
        
        if (number <= 0) {
            return;  // Eğer sayı 0 veya negatifse dur
        }

        // 5 çıkarma işlemi
        recursiveStep(number - 5);

        // 5 ekleme işlemi
        System.out.print(number + " ");
    }
}