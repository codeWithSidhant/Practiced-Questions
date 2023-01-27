package SortingPlacementEx4;

public class SortingEx1 {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {4, 1, 3, 9, 7};
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = 1; j < N; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }
}
