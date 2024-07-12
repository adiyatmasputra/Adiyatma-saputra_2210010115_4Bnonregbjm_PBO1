public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Accessor
    public String getName() {
        return name;
    }

    // Mutator
    public void setName(String name) {
        this.name = name;
    }

    // Accessor
    public int getAge() {
        return age;
    }

    // Mutator
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Method
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
