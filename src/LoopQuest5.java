import java.util.Scanner;

public class LoopQuest5 {
    public static void main(String[] args) {
        /*
         * If a number is a multiple of three, mark it: Fizz.
         * If a number is a multiple of five, mark it: Buzz.
         * If a number is a multiple of three and five, mark it: FizzBuzz.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till where you want to find whether its is Fizz, Buzz or FizzBuzz ");
        int numb = sc.nextInt();

        for (int i = 1; i <= numb; i++) {



            if (i % 15== 0) {
                System.out.println(i + "_____FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println(i + "_____Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println(i + "_____Buzz");
            }
        }
    }
}

