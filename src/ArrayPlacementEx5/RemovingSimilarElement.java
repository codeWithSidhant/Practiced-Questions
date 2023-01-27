package ArrayPlacementEx5;

public class RemovingSimilarElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5};

        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i] != arr[i + 1]) {
                temp[index] = arr[i];
                index++;
            }
            temp[index] = arr[arr.length - 1];//for last element

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
