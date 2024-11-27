// Write a program to print factorial of a Number using Recursion
public class Factorial {
    public static void main(StringTraversing[] args) {
        int x = fact(5);
        System.out.println(x);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);

    }

}