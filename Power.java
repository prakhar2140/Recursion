public class Power {
    public static void main(StringTraversing[] args) {
        int x = pow(12, 1);
        System.out.println(x);
        System.out.println("Better approach to find square of the number ");
        int z = powLog(3, 3);
        System.out.println(z);

    }

    public static int pow(int x, int b) {
        if (b == 0)
            return 1;
        return x * pow(x, b - 1);
    }
    // Better approach to find power of the given number basically it is using
    // Logarithm to find power of the given no so it takes less time to execute

    public static int powLog(int x, int b) {
        int ans;
        if (b == 0)
            return 1;
        if (b % 2 == 0) {
            ans = pow(x, b / 2) * pow(x, b / 2);
        } else {
            ans = pow(x, b / 2) * pow(x, b / 2) * x;
        }
        return ans;
    }
}
