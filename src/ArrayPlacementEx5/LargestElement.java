package ArrayPlacementEx5;

public class LargestElement {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {2, 5, 1, 3, 0};
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
