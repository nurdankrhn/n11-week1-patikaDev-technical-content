import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        int n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        int n2 = input.nextInt();

        // EBOB hesaplama
        int ebob = findEBOB(n1, n2);
        System.out.println("EBOB : " + ebob);

        // EKOK hesaplama
        int ekok = findEKOK(n1, n2, ebob);
        System.out.println("EKOK : " + ekok);

        input.close();
    }

    // EBOB hesaplayan fonksiyon
    private static int findEBOB(int n1, int n2) {
        int smaller = Math.min(n1, n2);
        int ebob = 1;

        while (smaller > 0) {
            if (n1 % smaller == 0 && n2 % smaller == 0) {
                ebob = smaller;
                break;
            }
            smaller--;
        }

        return ebob;
    }

    // EKOK hesaplayan fonksiyon
    private static int findEKOK(int n1, int n2, int ebob) {
        return (n1 * n2) / ebob;
    }
}