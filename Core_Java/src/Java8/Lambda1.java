package Java8;

// Functional interface with a single abstract method44
interface Sum {
    int add(int a, int b);
}

public class Lambda1 {

    public static void main(String[] args) {
        // Using a lambda expression to implement the Sum interface
        Sum sum = (a, b) -> a + b;

        // Testing the lambda expression
        int result = sum.add(5, 3);
        System.out.println("The sum is: " + result);
    }
}
