public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote; // Sözlü notu
    double oralNoteWeight; // Sözlü notunun ortalamaya etkisi

    public Course(String name, String code, String prefix, double oralNoteWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote = 0;
        this.oralNoteWeight = oralNoteWeight; // Sözlü notunun ortalamaya etkisi
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    // Sözlü notunu ekleyip dersin ortalamasını hesaplayan metot
    public void addOralNote(int oralNote) {
        if (oralNote >= 0 && oralNote <= 100) {
            this.oralNote = oralNote;
        } else {
            System.out.println("Geçersiz sözlü notu!");
        }
    }

    public double calculateCourseAverage() {
        return (this.oralNote * this.oralNoteWeight) + (this.note * (1 - this.oralNoteWeight));
    }
}