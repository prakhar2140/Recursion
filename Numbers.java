// Write a program to print numbers from n to 1 using Recursion
public class Numbers {
    public static void main(StringTraversing[] args) {
        System.out.println("Number from 1 to n ");
        print(10);
        System.out.println("Number from n to 1 ");
        printFarward(5);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    // Program to print numbers from 1 to n
    static void printFarward(int n) {
        if (n == 0) {
            return;
        }
        printFarward(n - 1);
        System.out.println(n);
    }
}
