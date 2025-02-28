class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");

        // Simulating waiting/blocking state
        try {
            Thread.sleep(1000);  // Thread goes to WAITING/BLOCKED state
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thread has completed");  // Thread enters TERMINATED state after run() ends
    }
}

public class ThreadLifeCycleExample {
    public static void main(String[] args) {
        // NEW state: Thread object is created
        MyThread t = new MyThread();
        System.out.println("Thread state: " + t.getState());  // NEW state

        // Runnable state: After calling start()
        t.start();
        System.out.println("Thread state after start(): " + t.getState());  // Runnable state

        // Sleep to simulate waiting time in main thread
        try {
            Thread.sleep(500);  // Main thread in TIMED_WAITING state
            System.out.println("Thread state while running: " + t.getState());  // RUNNING/WAITING
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Join to wait for thread to finish and enter TERMINATED state
        try {
            t.join();  // Main thread waits for t to terminate
            System.out.println("Thread state after completion: " + t.getState());  // TERMINATED state
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

