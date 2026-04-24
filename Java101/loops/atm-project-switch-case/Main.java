import java.util.Scanner;

public class Main {
    private static final String USERNAME = "patika";
    private static final String PASSWORD = "dev123";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            String userName = input.nextLine();

            System.out.print("Parolanız : ");
            String password = input.nextLine();

            if (USERNAME.equals(userName) && PASSWORD.equals(password)) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                runAtm(input, balance);
                input.close();
                return;
            }

            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre.");
            System.out.println(right == 0
                    ? "Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz."
                    : "Kalan Hakkınız : " + right);
        }

        input.close();
    }

    private static void runAtm(Scanner input, int balance) {
        int select;

        do {
            System.out.println("\n1-Para Yatırma");
            System.out.println("2-Para Çekme");
            System.out.println("3-Bakiye Sorgula");
            System.out.println("4-Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Para miktarı : ");
                    balance += input.nextInt();
                    System.out.println("Güncel Bakiyeniz : " + balance);
                    break;
                case 2:
                    System.out.print("Para miktarı : ");
                    int withdrawAmount = input.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Güncel Bakiyeniz : " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz : " + balance);
                    break;
                case 4:
                    System.out.println("Tekrar görüşmek üzere.");
                    break;
                default:
                    System.out.println("Geçersiz seçim yaptınız.");
            }
        } while (select != 4);
    }
}