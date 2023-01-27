package RecursionPlacementEx2;

public class SwapingArrayElements {


    public static void main(String[] args) {
        int n = 100;
        int arr[] = new int[n];
        System.out.print("Input :");
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        function(0, n, arr);
        System.out.print("Output :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public static void function(int i, int n, int arr[]) {

        if (i >= (n / 2)) {
            return;
        } else {

            int[] temp = new int[n];

            temp[i] = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp[i];
            ;
            function(i + 1, n, arr);
        }

    }
}
