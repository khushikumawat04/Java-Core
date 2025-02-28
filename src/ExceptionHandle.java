public class ExceptionHandle {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int arr[] = {1, 2, 3, 4};
//            arr[5] = 10;
//            int result = 10 / 0; // This will throw ArithmeticException
            String s = null;
//            System.out.println(s.length());//NullPointerException

        }
//        System.out.println("Exception occurs:  " + e.getMessage());


//        catch (ArithmeticException e) {
//            // Handling the exception
//            System.out.println("Cannot divide by zero: " + e.getMessage());
//        }
//        catch (IndexOutOfBoundsException e) {
//            // Handling the exception
//            System.out.println("index out of bound:  " + e.getMessage());
//        }
        catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Null Pointer  " + e.getMessage());

        }
//        finally block
        finally {
            System.out.println("Finaly block executed");
        }
        System.out.println("Hello");
    }
}