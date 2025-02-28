class Employee {
    String name;
    int age;

    Employee() {
      System.out.println("Constructer called");  // Calls the constructor with parameters
    }

    Employee(String name, int age) {
//        this();
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(this);
        System.out.println("Name: "+ name+" age: "+age);
    }
}
public class Thiskeyword {
    public static void main(String[] args){
        Employee e = new Employee("khushi",21);
        e.display();
        System.out.println(e);


    }
}
