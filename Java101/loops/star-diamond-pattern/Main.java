import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int height = input.nextInt();

        if (height <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            printDiamond(height);
        }

        input.close();
    }

    private static void printDiamond(int height) {
        printUpperPart(height);
        printLowerPart(height);
    }

    private static void printUpperPart(int height) {
        for (int row = 0; row < height; row++) {
            printLine(height, row);
        }
    }

    private static void printLowerPart(int height) {
        for (int row = height - 2; row >= 0; row--) {
            printLine(height, row);
        }
    }

    private static void printLine(int height, int row) {
        int spaceCount = height - row - 1;
        int starCount = 2 * row + 1;

        for (int i = 0; i < spaceCount; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}