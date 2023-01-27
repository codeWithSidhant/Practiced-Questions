package ArrayPlacementEx5;

public class CountOnesIn2DArray {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] arr =  {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};

        int index = 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    index = i;
                }

            }

        }
        if (max==0) {
            index = -1;
        }
        System.out.println(index);
    }
}
