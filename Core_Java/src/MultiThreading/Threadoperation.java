package MultiThreading;

public class Threadoperation implements Runnable { // Implement Runnable interface

    @Override
    public void run() {
        System.out.println("Program started in a separate thread....");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Threadoperation th = new Threadoperation();
        
        int sumResult = th.sum(11, 22);
        int multiplyResult = th.multiply(3, 15, 25);
        
        System.out.println("Sum: " + sumResult);
        System.out.println("Multiply: " + multiplyResult);
        
        Thread t = new Thread(th); // Pass the Runnable instance to the Thread
        t.start(); // Start the thread, which will execute the run() method
       
        System.out.println("current thread:"+t.getName());
    }
}
