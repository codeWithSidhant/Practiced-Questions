package ArrayPlacementEx5;

public class LinearSearchimg {
    public static void main(String[] args) {
        System.out.println(numb());
    }
    public static int numb() {
        int numb = 3;
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numb) {
                return 1;
            }
        }
        return -1;
    }
}