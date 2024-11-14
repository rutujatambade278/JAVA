package MultiThreading;

public class Thread1 extends Thread { // Extend Thread class

    @Override
    public void run() {
        for (int a = 1; a <= 10; a++) { // Correct the loop condition to prevent infinite loop
            System.out.println("a: " + a);
            try {
                Thread.sleep(1500); // Sleep for 1.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Properly handle the exception
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t = new Thread1(); // Create a new thread object
        t.start(); // Start the thread
       
    }
}
