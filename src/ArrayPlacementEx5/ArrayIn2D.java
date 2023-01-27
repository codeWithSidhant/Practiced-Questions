package ArrayPlacementEx5;

public class ArrayIn2D {
    public static void main(String[] args) {
        int n = 9;
        int m = 7;
        int[][] array =
                {{1, 2, 2, 2, 3, 5, 7},
                        {9, 10, 13, 15, 15, 16, 19},
                        {19, 21, 21, 23, 23, 26, 26},
                        {27, 29, 29, 31, 31, 33, 34},
                        {35, 35, 35, 36, 36, 36, 37},
                        {38, 40, 41, 44, 45, 45, 48},
                        {48, 51, 52, 53, 53, 57, 57},
                        {58, 59, 59, 59, 61, 63, 64},
                        {65, 67, 68, 69, 70, 70, 70}};
        // Method 1: less effecient;

        /*int ans = 0;
        int sol = 0;
        int target = 31;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == target) {
                    ans = 1;
                    break;
                } else {
                    ans = 0;
                }
            }
            if (ans == 1) {
                System.out.println("yes");
                break;
            }
        }
        if((ans==0)){
            System.out.println("No");
        }
    }*/

        System.out.println(sol(array, m, n));

    }

    //methpd 2: More effecient method
    public static int sol(int[][] array, int m, int n) {
        int target = 31;
        int ans = 0;
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (array[i][j] == target) {
                ans = 1;
            }
            if (array[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }
}
