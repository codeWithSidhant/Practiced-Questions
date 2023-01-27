public class Debugging2Darray2 {
    public static void main(String[] args) {
      char[][]matrix = new char[][]{
              {'_','_','_'},
              {'_','_','_'},
              {'_','_','_'}

      };
        for (int i = 0; i <matrix.length ; i++) {
            matrix[2-i][2-i]='X';
            matrix[i][2-i]='O';

                }
        printMatrix(matrix);
        System.out.println("\n\nO Wins");
    }
    public static void printMatrix(char[][]matrix){
        for (int i = 0; i <matrix.length ; i++) {
            System.out.print("\n");
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j] +" ");
            }
        }
    }
}
