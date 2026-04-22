import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, hipotenus, u, alan;

        System.out.print("1. kenarı girin: ");
        a = input.nextDouble();

        System.out.print("2. kenarı girin: ");
        b = input.nextDouble();

        hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hipotenus);

        System.out.print("3. kenarı girin: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);

        input.close();
    }
}