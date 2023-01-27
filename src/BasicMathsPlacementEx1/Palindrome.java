package BasicMathsPlacementEx1;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {

        int n = 1221;
        int x = n;

        List<Integer> arr = new ArrayList<Integer>();


        while (n >= 10) {
            int mod = n % 10;
            arr.add(mod);
            n = n / 10;
        }
        arr.add(n);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
        System.out.println();


        int indexFirst = 0;
        int indexLast = arr.size() - 1;
        boolean flag = true;


        while (indexFirst <= indexLast) {

            if (arr.get(indexFirst) == arr.get(indexLast)) {
            } else {
                flag = false;
                break;
            }
            indexFirst++;
            indexLast--;
        }
        if (flag == true) {
            System.out.print("\nYes");
        }
        if (flag == false) {
            System.out.print("\nNo");
        }

    }

}
