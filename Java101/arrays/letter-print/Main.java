public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];  // B harfi için 7x4 boyutunda bir dizi

        // B harfini oluşturmak için diziyi dolduruyoruz
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (j == 0) {
                    letter[i][j] = " * ";  // Sol kenara yıldız
                } else if ((i == 0 || i == 3 || i == 6) && j != 0) {
                    letter[i][j] = " * ";  // Üst, orta ve alt satırlara yıldız
                } else if (j == 3 && (i != 0 && i != 3 && i != 6)) {
                    letter[i][j] = " * ";  // Sağ kenara yıldız
                } else {
                    letter[i][j] = "   ";  // Diğer alanlar boş
                }
            }
        }

        // Diziyi ekrana yazdırıyoruz
        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}