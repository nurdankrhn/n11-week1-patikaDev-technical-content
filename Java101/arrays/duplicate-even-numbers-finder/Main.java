import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        System.out.println("Diziyi giriniz:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        findDuplicateEvenNumbers(numbers);

        input.close();
    }

    public static void findDuplicateEvenNumbers(int[] numbers) {
        Set<Integer> seenNumbers = new HashSet<>();
        Set<Integer> duplicateEvenNumbers = new HashSet<>();

        for (int num : numbers) {
            if (num % 2 == 0) { // Çift sayı mı kontrolü
                if (seenNumbers.contains(num)) {
                    duplicateEvenNumbers.add(num);
                } else {
                    seenNumbers.add(num);
                }
            }
        }

        if (duplicateEvenNumbers.isEmpty()) {
            System.out.println("Tekrar eden çift sayı bulunmamaktadır.");
        } else {
            System.out.println("Tekrar eden çift sayılar: ");
            for (int num : duplicateEvenNumbers) {
                System.out.print(num + " ");
            }
        }
    }
}