public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.80); // %80 sınav, %20 sözlü etkisi
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.70); // %70 sınav, %30 sözlü etkisi
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.60); // %60 sınav, %40 sözlü etkisi

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 60, 70);
        s1.addBulkOralNote(90, 85, 80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(70, 80, 90);
        s2.addBulkOralNote(70, 80, 90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(40, 50, 60);
        s3.addBulkOralNote(60, 65, 70);
        s3.isPass();
    }
}