package HashingPlacementEx3;

public class CountingNumbers {
    public static void main(String[] args) {
        int N = 7;
        int index = 8;
        int[] arr = {1, 1, 2, 2, 2, 4, 5, 7};
        frequencyCount(arr, N, index);
    }

    public static void frequencyCount(int arr[], int N, int index) {

        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 0; j < index; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            System.out.println(i + "_>" + count + "");
        }

    }
}
