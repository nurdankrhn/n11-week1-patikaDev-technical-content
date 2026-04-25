import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Çalışan bilgilerini al
        System.out.print("Çalışanın Adı ve Soyadı : ");
        String name = input.nextLine();

        System.out.print("Çalışanın Maaşı : ");
        double salary = input.nextDouble();

        System.out.print("Çalışanın Haftalık Çalışma Saati : ");
        int workHours = input.nextInt();

        System.out.print("Çalışanın İşe Başlangıç Yılı : ");
        int hireYear = input.nextInt();

        // Employee nesnesi oluştur
        Employee emp = new Employee(name, salary, workHours, hireYear);

        // Çalışanın bilgilerini yazdır
        System.out.println(emp.toString());

        input.close();
    }
}