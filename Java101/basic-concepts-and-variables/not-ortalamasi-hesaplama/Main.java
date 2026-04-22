import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double matematik, fizik, kimya, turkce, tarih, muzik, ortalama;

        System.out.print("Matematik notu: ");
        matematik = input.nextDouble();

        System.out.print("Fizik notu: ");
        fizik = input.nextDouble();

        System.out.print("Kimya notu: ");
        kimya = input.nextDouble();

        System.out.print("Türkçe notu: ");
        turkce = input.nextDouble();

        System.out.print("Tarih notu: ");
        tarih = input.nextDouble();

        System.out.print("Müzik notu: ");
        muzik = input.nextDouble();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        String durum = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamanız: " + ortalama);
        System.out.println(durum);

        input.close();
    }
}