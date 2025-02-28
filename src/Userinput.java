import  java.util.Scanner;
public class Userinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Taking integer input
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        System.out.println("Integer Value: " + intValue);

        // Taking float input
        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();
        System.out.println("Float Value: " + floatValue);

        // Taking string input
        System.out.print("Enter a string: ");
        sc.nextLine();  // Consume the newline character left by nextFloat()
        String stringValue = sc.nextLine();
        System.out.println("String Value: " + stringValue);


        // Taking boolean input
        System.out.print("Enter a boolean: ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("Boolean Value: " + booleanValue);

        sc.close();
    }
}
