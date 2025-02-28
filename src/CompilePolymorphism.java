class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (Overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompilePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls the method that adds two integers
        System.out.println("Sum of two numbers: " + calc.add(10, 20));

        // Calls the method that adds three integers
        System.out.println("Sum of three numbers: " + calc.add(10, 20, 30));
    }
}
