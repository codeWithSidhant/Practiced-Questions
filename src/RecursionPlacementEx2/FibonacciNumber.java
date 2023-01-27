package RecursionPlacementEx2;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; true; i++) {
            System.out.print(fib(i) + " ");
            if (i == n) {
                break;
            }
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            int last = fib(n - 1);
            int slast = fib(n - 2);
            int sum = last + slast;
            return sum;
        }
    }
}