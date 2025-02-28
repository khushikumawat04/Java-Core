
// Example using Runnable interface
class thread1 implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Interface 1: " + i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
class thread2 implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Interface 2: " + i);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class MultithreadRunnable {
    public static void main(String[] args) {
        thread1 t1 = new thread1(); // Create an instance of MyRunnable
        Thread thread1 = new Thread(t1); // Pass it to a Thread object
        thread1 t2 = new thread1(); // Create an instance of MyRunnable
        Thread thread2 = new Thread(t1);
        thread1.start(); // Start the thread
        thread2.start(); // Start the thread
    }
}

