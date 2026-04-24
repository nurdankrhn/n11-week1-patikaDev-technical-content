import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int year = input.nextInt();

        LeapYearCalculator calculator = new LeapYearCalculator();
        boolean isLeapYear = calculator.isLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }

        input.close();
    }
}

final class LeapYearCalculator {

    public boolean isLeapYear(int year) {
        if (isDivisible(year, 400)) {
            return true;
        }

        if (isDivisible(year, 100)) {
            return false;
        }

        return isDivisible(year, 4);
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}