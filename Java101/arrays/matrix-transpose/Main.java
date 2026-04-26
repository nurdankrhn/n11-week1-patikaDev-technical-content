import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan matrisin boyutlarını al
        System.out.print("Matrisin satır sayısını giriniz: ");
        int rows = input.nextInt();

        System.out.print("Matrisin sütun sayısını giriniz: ");
        int cols = input.nextInt();

        // Kullanıcıdan matris elemanlarını al
        int[][] matrix = new int[rows][cols];
        System.out.println("Matrisin elemanlarını giriniz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Eleman[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Matrisin transpozunu al
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpoze matrisini ekrana yazdır
        System.out.println("Matrisin Transpozu (Devriği):");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}