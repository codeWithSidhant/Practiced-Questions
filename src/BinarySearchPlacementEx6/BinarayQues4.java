package BinarySearchPlacementEx6;

public class BinarayQues4 {
    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 2, 3, 4};
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid < high && arr[mid] > arr[mid + 1])
                return mid + 1;
            if (mid > low && arr[mid] < arr[mid - 1])
                return mid;
            if (arr[low] >= arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return 0;
    }
}
