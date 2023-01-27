package ArrayPlacementEx5;

public class AppearsOnceElement {
    public static void main(String[] args) {
        int arr[] = {2, 2, 5, 5, 20, 30, 30};
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                i++;
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
