# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data persen menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan umur, dan memberikan output berupa informasi detail tersebut

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** 

```bash
public class Person {
    ...
}

public class Student {
    ...
}

public class Main {
    ...
}
```

2. **Object** 
```bash
Person person1
Student student1
```

3. **Atribut** 
```bash
private String studentId;
    private String major;
    private double gpa;
```

4. **Constructor** 

```bash
this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
}


```

5. **Mutator** 

```bash
public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

public void setMajor(String major) {
        this.major = major;
    }
```

6. **Accessor** 

```bash
 public String getStudentId() {
        return studentId;
    }

public String getMajor() {
        return major;
    }
```

7. **Encapsulation** 
```bash
private String studentId;
    private String major;
    private double gpa;
```

8. **Inheritance** 
```bash
public static void main(String[] args) {
    ...
}
```

9. **Polymorphism** 
```bash
public void displayInfo()

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** 
```bash
public Student(String studentId, String major, double gpa) {
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;

}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mahasiswas.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Mahasiswa:");
System.out.println(mahasiswa.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Adiyatma saputra
NPM: 2110010115
