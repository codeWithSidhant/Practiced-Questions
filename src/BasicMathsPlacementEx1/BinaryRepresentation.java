package BasicMathsPlacementEx1;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[32];

        while (n >= 1) {
            for (int i = 0; i < arr.length; i++) {
                int mod = n % 2;
                arr[i] = mod;
                n = n / 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum  = sum + (long) Math.pow(2, 31 - i);
            }
        }
        System.out.println();
        System.out.println(sum);

    }
    }



