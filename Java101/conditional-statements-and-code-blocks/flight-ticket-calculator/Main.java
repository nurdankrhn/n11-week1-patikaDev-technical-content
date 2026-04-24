import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age, tripType;
        double distance, normalPrice, ageDiscountedPrice, totalPrice;

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType = input.nextInt();

        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            normalPrice = distance * 0.10;

            if (age < 12) {
                ageDiscountedPrice = normalPrice * 0.50;
            } else if (age <= 24) {
                ageDiscountedPrice = normalPrice * 0.90;
            } else if (age > 65) {
                ageDiscountedPrice = normalPrice * 0.70;
            } else {
                ageDiscountedPrice = normalPrice;
            }

            if (tripType == 2) {
                totalPrice = ageDiscountedPrice * 0.80 * 2;
            } else {
                totalPrice = ageDiscountedPrice;
            }

            System.out.println("Toplam Tutar = " + totalPrice + " TL");
        }

        input.close();
    }
}