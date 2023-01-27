package ArrayPlacementEx5;

public class MovezerotoEnd {
    public static void main(String[] args) {
        int arr[] = {3, 5, 0, 0, 4};
        int temp[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int j = 0; j < temp.length; j++) {
            System.out.print(temp[j] + " ");
        }
    }
}