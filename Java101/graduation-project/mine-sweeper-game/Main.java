import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static String[][] gameBoard;
    static String[][] playerBoard;
    static int row, col;
    static int totalMines;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        
        // Kullanıcıdan matris boyutlarını al
        do {
            System.out.print("Satır Giriniz : ");
            row = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            col = input.nextInt();

            if (row < 2 || col < 2) {
                System.out.println("Matris boyutu 2x2'den küçük olamaz!");
            }
        } while (row < 2 || col < 2);

        gameBoard = new String[row][col];
        playerBoard = new String[row][col];
        totalMines = (row * col) / 4;

        // İlk başta tüm alanları "-" ile doldur
        initializeGameBoard();

        // Mayınları yerleştir
        placeMines();

        // Oyuncu tahtasını başlat
        initializePlayerBoard();

        // Oyunu başlat
        playGame(input);

        input.close();
    }

    public static void initializeGameBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gameBoard[i][j] = "-";  // Boş alan
            }
        }
    }

    public static void initializePlayerBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                playerBoard[i][j] = "-";  // Başlangıçta hiçbir şey gösterme
            }
        }
    }

    // Mayınları rastgele yerleştirme
    public static void placeMines() {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < totalMines) {
            int r = rand.nextInt(row);
            int c = rand.nextInt(col);

            if (!gameBoard[r][c].equals("*")) {
                gameBoard[r][c] = "*";
                placedMines++;
            }
        }
    }

    // Komşu mayın sayısını hesapla
    public static int countMines(int r, int c) {
        int count = 0;

        // Komşuları kontrol et (8 yön)
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (r + i >= 0 && r + i < row && c + j >= 0 && c + j < col) {
                    if (gameBoard[r + i][c + j].equals("*")) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // Kullanıcıdan giriş al
    public static void playGame(Scanner input) {
        int openedCells = 0;
        boolean gameOver = false;
        
        while (!gameOver) {
            printBoard();
            System.out.print("Satır Giriniz: ");
            int r = input.nextInt();
            System.out.print("Sütun Giriniz: ");
            int c = input.nextInt();

            // Geçerli bir koordinat mı
            if (r < 0 || r >= row || c < 0 || c >= col) {
                System.out.println("Geçersiz koordinat! Lütfen tekrar deneyin.");
                continue;
            }

            // Daha önce seçilen bir alan mı
            if (!playerBoard[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            // Mayına basılmış mı
            if (gameBoard[r][c].equals("*")) {
                gameOver = true;
                System.out.println("Game Over!!");
            } else {
                // Mayın sayısını hesapla
                int surroundingMines = countMines(r, c);
                playerBoard[r][c] = Integer.toString(surroundingMines);

                openedCells++;

                if (openedCells == (row * col - totalMines)) {
                    gameOver = true;
                    System.out.println("Oyunu Kazandınız !");
                }
            }
        }

        printBoard();
    }

    // Oyuncunun tahtasını ekrana yazdır
    public static void printBoard() {
        System.out.println("===========================");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(playerBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}