package ArrayPlacementEx5;

import java.util.ArrayList;
import java.util.Collections;

public class InrersectionAndUnion {
    public static void main(String[] args) {
        int arr1[] = {2, 2, 3, 4, 5};
        int n = 5;
        int arr2[] = {1, 1, 2, 3, 4};
        int m = 5;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && arr1[i] != arr1[i + 1]) {
                temp.add(arr1[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            if (i + 1 < m && arr2[i] != arr2[i + 1]) {
                temp.add(arr2[i]);
            }
        }
        temp.add(arr1[arr1.length - 1]);
        temp.add(arr2[arr2.length - 1]);

        Collections.sort(temp);
        for (int i = 0; i < temp.size(); i++) {
            if (i + 1 < temp.size() && temp.get(i).equals(temp.get(i + 1))) {
                temp.remove(i);
            }
        }
        System.out.println(temp);
    }
}
