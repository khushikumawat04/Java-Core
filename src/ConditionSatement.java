public class ConditionSatement {
    public static void main(String [] args) {

//if statement
        int age = 30;
        if (age > 18) {
            System.out.println("This is an adult");
        }

// if -else statement
        int age1 = 30;
        if (age1 > 18) {
            System.out.println("This is an adult");
        } else {
            System.out.println("This is not an adult");
        }
//  else -if
        int i = 20;

        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");

// conditional
        int num = 20;
        switch (num) {
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 15:
                System.out.println("It is 15");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");
        }
    }
}
