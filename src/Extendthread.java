
import  java.lang.Thread;
class NumberThread extends Thread {
    public void run() {
        try{
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class AlphabetThread extends Thread {
    public void run() {
        try{
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

public class Extendthread  {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();  // Task 1
        AlphabetThread t2 = new AlphabetThread();  // Task 2

        t1.start();  // Start Task 1 in a new thread
        t2.start();  // Start Task 2 in another thread
    }
}
