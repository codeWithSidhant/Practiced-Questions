package BinarySearchPlacementEx6;

public class Example2 {
    public static void main(String[] args) {
        int N = 78;
        int x = 159;
        int arr[] = {35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113};
        int startIndex = 0;
        int lastIndex = arr.length - 1;
        int midIndex = (startIndex + lastIndex) / 2;
        int index = -1;
        while (startIndex <= lastIndex) {

            if (arr[midIndex] == x) {
                index = midIndex;
                if (index > 1) {
                    index = index - 1;
                }
                break;
            } else if (arr[midIndex] < x) {
                startIndex = midIndex + 1;
            } else {
                lastIndex = midIndex - 1;
            }
            midIndex = (startIndex + lastIndex) / 2;
        }
        System.out.println(index);
    }
}
