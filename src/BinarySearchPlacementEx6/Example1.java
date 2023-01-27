package BinarySearchPlacementEx6;

public class Example1 {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int K = 6;
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midindex=(startIndex + endIndex) / 2;
        int index = -1;
        while (startIndex <= endIndex) {

            if (arr[midindex] == K) {
                index = midindex;
                break;
            } else if (arr[midindex] < K) {
                startIndex = midindex + 1;

            } else {
                endIndex = midindex - 1;
            }
            midindex = (startIndex + endIndex) / 2;
        }
        System.out.println(index);
    }
}
