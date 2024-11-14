package Core_program;

import java.util.HashMap;
import java.util.Map;

public class MyThread extends Thread {

    static Map<Integer, String> map = new HashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            map.put(103, "D");
            System.out.println("Child thread added element: 103 -> D");
        } catch (Exception e) {
            System.out.println("Exception in child thread: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        map.put(111, "Ram");
        map.put(102, "Sita");

        MyThread thread = new MyThread();
        thread.start();

        // Iterate over the map entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }

        // Wait for the child thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted during join: " + e.getMessage());
        }

        System.out.println("Final map contents: " + map);
    }
}
