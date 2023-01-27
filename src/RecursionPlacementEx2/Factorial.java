package RecursionPlacementEx2;

import java.util.ArrayList;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialN(5));

    }

    public static int factorialN(int n) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        if (n < 1) {
            return 1;

        } else {
            return n * factorialN(n - 1);
        }
    }
}
