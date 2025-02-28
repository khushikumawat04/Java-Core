public class Loops {
    public static void main(String[] args){
//        For Loop
        System.out.println("For Loop");
        for (int i=1; i<=20; i++) {
            System.out.println(i);
        }
//While Loop
        System.out.println("While Loop");
        int i = 0;
        while(i<=20) {
            System.out.println(i);
            i++;
        }

// Do while Loop
        System.out.println(" Do While Loop");
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while(a<=20);

//        Break statement
        System.out.println("Break statement");

        for (int j=1; j<=20; j++) {

            if (j == 11) {
                break;
            }
            System.out.println(j);
        }

//        continue statement
        int k;
        for (k=1; k<=20; k++) {

            if (k%3==0) {
                continue;
            }
            System.out.println(k);
        }



    }
}
