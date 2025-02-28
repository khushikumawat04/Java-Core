public class DataType {

    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 100000;
        long longVar = 10000000000L;
        float floatVar = 234.5f;
        double doubleVar = 123.456;
        char charVar = 'A';
        boolean boolVar = true;

        // Reference data type
        String stringVar = "Hello, Java!";

        // Output the values
        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Int Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Char Value: " + charVar);
        System.out.println("Boolean Value: " + boolVar);
        System.out.println("String Value: " + stringVar);


/*...........Type Casting...........*/
//        Implicit/widening
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

//        Explicit /narrowing
        double Double = 9.78d;
        int Intno = (int) myDouble; // Manual casting: double to int

        System.out.println(Double);   // Outputs 9.78
        System.out.println(Intno);      // Outputs 9



    }
}
