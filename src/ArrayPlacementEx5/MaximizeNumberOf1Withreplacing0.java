package ArrayPlacementEx5;

public class MaximizeNumberOf1Withreplacing0 {
    public static void main(String[] args) {
        int ans = 0;
        int count = 0;
        int j = -1;
        int arr[] = {0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
        int k = 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }

            while (count > k) {
                j++;
                if (arr[j] == 0) {
                    count--;
                }
            }
            int len = i - j;
            if (len > ans) {
                ans = len;
            }

        }
        System.out.println(ans);
    }
}
