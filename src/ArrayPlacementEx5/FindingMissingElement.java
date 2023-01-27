package ArrayPlacementEx5;

import java.util.Arrays;

public class FindingMissingElement {
    public static void main(String[] args) {
        int array[] = {3, 1, 2, 5, 4, 6, 7, 5};

        //Sorting Array
        Arrays.sort(array);

       /* for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] <= array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }*/

        //Remove similar element;
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length && array[i] == array[i + 1]) {
                System.out.print("\nRepeating Element: " + (i + 1) + "\n");
            }
        }
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length && array[i] != array[i + 1]) {
                arr[i] = array[i];
            }
        }
        arr[arr.length - 1] = array[array.length - 1];


        int temp[] = new int[array.length];

        for (int i = 0; i < temp.length; i++) {
            if (i + 1 < arr.length && arr[i] == 0) {
                int tempo = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tempo;
            }
            temp[i] = (i + 1);
            if (temp[i] != arr[i]) {
                System.out.println("Missing element: " + temp[i]);
                break;
            }
        }

    }
}
