import java.util.Scanner;

public class LoopQues4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till where you want to find whether its even or odd ");
        int numb = sc.nextInt();

        for(int i=1; i<=numb; i++){
            if(i%2==0){
                System.out.println(i+"_____Even Number");
            }else {
                System.out.println(i+"_____Odd Number");
            }
        }

    }
}
