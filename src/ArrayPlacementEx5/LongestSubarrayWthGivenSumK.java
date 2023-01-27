package ArrayPlacementEx5;

public class LongestSubarrayWthGivenSumK {
    public static void main(String[] args) {
        int ans = 0;
        int k = 15;
        int arr[] = {13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int sum = 0;
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            while (sum > k) {
                j++;
                sum = sum - (arr[j]);

            }
            int len = i - j;
            if (len > ans) {
                ans = len;
                if (ans == arr.length) {
                    ans = 0;
                }
            }

        }
        System.out.println(ans);
    }
}