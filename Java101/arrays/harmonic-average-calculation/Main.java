public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;

        // Harmonik seriyi hesaplama
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }

        // Harmonik ortalama
        double harmonicAverage = numbers.length / sum;

        System.out.println("Dizinin Harmonik Ortalaması: " + harmonicAverage);
    }
}