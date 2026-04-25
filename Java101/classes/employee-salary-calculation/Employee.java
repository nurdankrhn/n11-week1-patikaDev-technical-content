public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    // Bonus hesaplama metodu
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışı hesaplama metodu
    public double raiseSalary() {
        int yearsWorked = 2021 - this.hireYear;
        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // toString metodu, çalışanın bilgilerini ekrana yazdıracak
    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();
        double totalSalary = this.salary + bonus + raiseSalary - tax;
        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raiseSalary + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus + raiseSalary - tax) + "\n" +
                "Toplam Maaş : " + totalSalary;
    }
}