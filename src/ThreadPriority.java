class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is running with priority " + getPriority());
            try {
                // Simulating some work with sleep
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadPriority{
    public static void main(String[] args) {
        // Creating thread instances
        MyThread1 lowPriorityThread = new MyThread1();
        MyThread1 normalPriorityThread = new MyThread1();
        MyThread1 highPriorityThread = new MyThread1();

        // Setting thread names (optional)
        lowPriorityThread.setName("Low Priority Thread");
        normalPriorityThread.setName("Normal Priority Thread");
        highPriorityThread.setName("High Priority Thread");

        // Setting priorities
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // 1
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);  // 5 (default)
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);  // 10

        // Starting threads
        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }
}
