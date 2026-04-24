import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, answer;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            answer = inp.nextLine();

            if (answer.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifrenizi giriniz : ");
                newPassword = inp.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }

        inp.close();
    }
}