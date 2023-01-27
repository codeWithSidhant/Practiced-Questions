package BinarySearchPlacementEx6;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int N = 8 ;
        int x = 7;
        int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        int startIndex = 0;
        int lastIndex = arr.length - 1;
        int midIndex = (startIndex + lastIndex) / 2;
        int index = -1;
        int cell=0;
        int floor=0;
        Arrays.sort(arr);
        while (startIndex <= lastIndex) {

            if (arr[midIndex] == x) {
                index = midIndex;
                if (index > 1) {
                    cell=arr[index+1];
                    floor=arr[index-1];
                }
                break;

            } else if (arr[midIndex] < x) {
                startIndex = midIndex + 1;
            } else {
                lastIndex = midIndex - 1;
            }
            midIndex = (startIndex + lastIndex) / 2;
        }
        System.out.println(cell);
        System.out.println(floor);
    }
}
