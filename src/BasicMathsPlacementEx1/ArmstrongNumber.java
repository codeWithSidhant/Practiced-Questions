package BasicMathsPlacementEx1;

import java.util.ArrayList;

public class  ArmstrongNumber {
    public static void main(String[] args) {


        int n = 1533;
        int x = n;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (n >= 10) {
            int mod = n % 10;
            arr.add(mod);
            n = n / 10;
        }
        arr.add(n);
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = (int) (sum + Math.pow(arr.get(i), arr.size()));
        }

        if (sum == x) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}