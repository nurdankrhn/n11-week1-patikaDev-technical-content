import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu al
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        // Kullanıcıdan dizinin elemanlarını al
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Frekansları hesaplamak için bir Map (HashMap) kullanıyoruz
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Diziyi gezerek her elemanın frekansını hesaplıyoruz
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Sonuçları ekrana yazdırma
        System.out.println("Tekrar Sayıları:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }

        input.close();
    }
}