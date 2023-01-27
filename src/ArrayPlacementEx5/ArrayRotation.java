package ArrayPlacementEx5;

public class ArrayRotation {
    public static void main(String[] args) {

        int N = 6;
        int K = 2;
        if (K > N) {
            K = K % N;
        }
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] temp = new int[N];
        int j = 0;
        for (int i = K; i < arr.length; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < K; i++) {
            temp[temp.length - K + i] = arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}