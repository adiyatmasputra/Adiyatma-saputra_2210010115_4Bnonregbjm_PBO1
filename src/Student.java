public class Student extends Person {
    private String major;
    private double gpa;
    private String grade;

    // Constructor
    public Student(String name, int age, String major, double gpa, String grade) {
        super(name, age);
        this.major = major;
        this.gpa = gpa;
        this.grade = grade;
    }

    // Accessor
    public String getMajor() {
        return major;
    }

    // Mutator
    public void setMajor(String major) {
        this.major = major;
    }

    // Accessor
    public double getGpa() {
        return gpa;
    }

    // Mutator
    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between 0.0 and 4.0");
        }
    }

    // Accessor
    public String getGrade() {
        return grade;
    }

    // Mutator
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Method
    public void study() {
        System.out.println(getName() + " is studying " + major + ".");
    }

    // Overriding method
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am majoring in " + major + " with a GPA of " + gpa + ".");
    }

    // Polymorphism example
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", grade='" + grade + '\'' +
                '}';
    }

    // Seleksi
    public void checkScholarshipEligibility() {
        if (gpa >= 3.5) {
            System.out.println(getName() + " is eligible for a scholarship.");
        } else {
            System.out.println(getName() + " is not eligible for a scholarship.");
        }
    }

    // Perulangan
    public void studyHours(int hours) {
        for (int i = 1; i <= hours; i++) {
            System.out.println(getName() + " has studied for " + i + " hour(s).");
        }
    }
}
