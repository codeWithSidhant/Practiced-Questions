import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("lets play Tic,Tac,Toe");
        char[][] board = new char[3][3];
        printArray(board);
        entry(board);

    }

    public static void printArray(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "_  ");
            }
        }
    }

    public static void entry(char[][] board) {
        System.out.println();
        for (int i = 0; i < 9; i++) {


            if (i % 2 == 0) {
                System.out.println();
                System.out.println("\nIts X turn");
                int[] spot = updating(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println();
                System.out.println("\nits O turn");
                int[] spot = updating(board);
                board[spot[0]][spot[1]] = 'O';

            }
            printArray(board);


            int count = CheckWin(board);
            if (count == 3) {
                System.out.println();
                System.out.println("\t \n" +
                        "" +
                        "X Win................");
                break;
            }
            if (count == -3) {
                System.out.println();
                System.out.println("\t \n" +
                        "" +
                        "O wins...............");
                break;
            }
            else if(i==8){
                System.out.println();
                System.out.println("\t \n Its a tie");
            }

        }
    }

    public static int[] updating(char[][] board) {
        System.out.print("pick up Row and Column __ __:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coloumn = sc.nextInt();
        while (board[row][coloumn] == 'X' || board[row][coloumn] == 'O') {
            System.out.print("Spot is taken ,Enter again __ __:");
            row = sc.nextInt();
            coloumn = sc.nextInt();
        }
        return new int[]{row, coloumn};
    }

    public static int CheckWin(char[][] board) {

        int count = 0;

        /*For Horizontal Line*/
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }

        }
        /*For Vertical Line */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
        }
        if (count == 3 || count == -3) {
            return count;
        } else {
            count = 0;
        }
        /*For Left Diagonal*/
        for (int a = 0; a < 3; a++) {
            if (board[a][a] == 'X') {
                count++;
            } else if (board[a][a] == 'O') {
                count--;
            }
        }
        if (count == 3 || count == -3) {
            return count;
        } else {
            count = 0;
        }
        /* For Right Diagonal */
        for (int b = 0; b < 3; b++) {
            int rowIndex = 2 - b;
            if (board[rowIndex][b] == 'X') {
                count++;
            } else if (board[rowIndex][b] == 'O') {
                count--;
            }
        }
        return count;
    }
}
