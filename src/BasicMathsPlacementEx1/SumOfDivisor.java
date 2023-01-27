package BasicMathsPlacementEx1;

public class SumOfDivisor {
    public static void main(String[] args) {

        long n = 12000;
        long sum = 0;
        while (n >= 1) {
            for (long i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }
            }
            n--;
        }
        System.out.println(sum);

    }
}
