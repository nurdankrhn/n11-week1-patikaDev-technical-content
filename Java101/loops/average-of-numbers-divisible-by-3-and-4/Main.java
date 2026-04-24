import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int limit = input.nextInt();

        int number = 0;
        int sum = 0;
        int count = 0;

        while (number <= limit) {
            if (number % 3 == 0 && number % 4 == 0) {
                sum += number;
                count++;
            }
            number++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Ortalama : " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }

        input.close();
    }
}