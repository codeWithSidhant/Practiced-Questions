package ArrayPlacementEx5;

public class MaximizeNumberOf1 {
    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        int m = 2;
        int arr[] = {0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max++;
                }
            } else {
                count = 0;
            }

        }
        System.out.println(max);
    }
}
