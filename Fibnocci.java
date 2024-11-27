// Write a function to calculate the nth fibonacci number using recursion
public class Fibnocci {
    public static void main(StringTraversing[] args) {
        int x = fibonacci(5);
        System.out.println(x);
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
