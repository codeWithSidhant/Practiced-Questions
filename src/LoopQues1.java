import java.util.Scanner;

public class LoopQues1 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();

        for (int i=0; i<=x ; i++){
            System.out.print(i+",");
        }
    }
}
