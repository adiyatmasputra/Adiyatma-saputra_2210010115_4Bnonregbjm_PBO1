import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // Buat objek Student
        Student student1 = new Student("John", 20, "Computer Science", 3.5, "A");
        Student student2 = new Student("Alice", 22, "Mathematics", 3.8, "A");
        Student student3 = new Student("Bob", 21, "Physics", 3.0, "B");
        Student student4 = new Student("Carol", 23, "Chemistry", 3.7, "A");
        Student student5 = new Student("David", 20, "Biology", 3.6, "A");

        // Tampilkan informasi student
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());

        // Panggil metode study
        student1.study();
        student2.study();
        student3.study();
        student4.study();
        student5.study();

        // Contoh seleksi dan perulangan
        student1.checkScholarshipEligibility();
        student2.studyHours(3);

        // Input/Output sederhana
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Mengonsumsi newline

        System.out.print("Enter student major: ");
        String major = scanner.nextLine();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        scanner.nextLine(); // Mengonsumsi newline

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        Student newStudent = new Student(name, age, major, gpa, grade);
        newStudent.introduce();
        newStudent.studyHours(3);

        // Array dan perulangan
        Student[] students = new Student[5];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        for (Student student : students) {
            student.introduce();
        }

        scanner.close(); // Menutup scanner setelah selesai digunakan
    }
}
