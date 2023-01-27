public class Debugging2dArray3 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3},
                {8, 6, 4},
                {2, 4, 6}
        };
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                if(j>i){
                    array[i][j]=0;
                }

            }
        }printArray(array);
    }

    public static void printArray(int[][]array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println();
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] +" ");
            }
        }
    }
}
