import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopQues3 {
    public static void main(String[] args) {
        System.out.println("Hey!!! Sidhant i heard you like t count the trees");
        System.out.println("\nSidhant: yes boi...");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPick a number to count by:");
        int a = sc.nextInt();

        System.out.println("Pick a number to start counting from:");
        int b = sc.nextInt();

        System.out.println("Pick a number to count to:");
        int c = sc.nextInt();

        for (int i = b; i <= c; i = i + 3) {

            System.out.print(i + ",");

        }
    }
}
