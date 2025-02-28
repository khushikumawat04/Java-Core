
class Person {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {  // Basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an object of Person class
        Person person = new Person();

        // Setting values using setter methods
        person.setName("John");
        person.setAge(25);

        // Accessing values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

