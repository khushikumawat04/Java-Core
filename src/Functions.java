public class Functions {

//    Void Methods: Do not return any value.
public static void printHello() {
    System.out.println("Hello, World!");
}

//    Parameterized Methods: Take inputs (parameters) and perform operations.
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
//    Returning Methods: Return a value to the caller.
public static int multiply(int x, int y) {
    return x * y;
}

    public static  void main(String[] args){
        printHello();
        System.out.println(multiply(7,2));
        int a = 10;
        int b = 20;
        sum(a, b); // Function Call


    }
}
