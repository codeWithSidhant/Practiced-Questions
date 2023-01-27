package ArrayPlacementEx5;

public class SecondLargestAndSecondSmallestElement {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {3, 56, 45, 35, 234, 57};
        //************************************Method 1//


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Element " + arr[1]);
        System.out.println("Second Smallest Element " + arr[arr.length - 2]);
    }
}

        //***********************************Method 2//
/*

        int largest = Integer.MIN_VALUE;
        int seconLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                seconLargest = largest;
                largest = arr[i];
            } else if (arr[i] > seconLargest && arr[i] != largest) {
                seconLargest = arr[i];
            }
        }
        System.out.println(seconLargest);
    }
}
*/
