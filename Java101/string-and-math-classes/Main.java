import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); // 0-99 arasında rastgele sayı

        Scanner input = new Scanner(System.in);
        int right = 0; // Kalan hak
        int selected; // Kullanıcının girdiği sayı
        int[] wrong = new int[5]; // Yanlış tahminler
        boolean isWin = false; // Kazanıp kazanmadığını kontrol et
        boolean isWrong = false; // Hatalı giriş yapılmış mı

        System.out.println("0-100 arasında bir sayıyı tahmin edin!");

        // 5 haklı bir döngü ile tahmin yapılır
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            // Geçerli bir sayı girilmediğinde
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            // Kullanıcı doğru sayıyı tahmin ettiğinde
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                // Kullanıcı yanlış tahmin yaptığında
                System.out.println("Hatalı bir sayı girdiniz!");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                // Yanlış tahmin yapılan sayıları kaydet
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }

        // Eğer kazanmadıysa kaybettiniz mesajı
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }
}