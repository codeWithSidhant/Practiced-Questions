package RecursionPlacementEx2;

public class SumOfNnumbers {
    public static void main(String[] args) {
        System.out.println(sumN(5));
    }

    public static int sumN(int n) {
        if (n < 1) {
            return 0;
        } else {
            return (int) Math.pow(n, 3) + sumN(n - 1);
        }
    }
}
