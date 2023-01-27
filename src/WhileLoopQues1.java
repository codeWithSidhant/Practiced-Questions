import java.util.Scanner;

public class WhileLoopQues1 {
    public static void main(String[] args) {
        System.out.println("Enter number between 1 to 5");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        RandomMethod();


        while (a != RandomMethod()) {
            System.out.println("Guess again");
            a = sc.nextInt();
        }
        System.out.println("Yes,your guess is right");


    }

    public static double RandomMethod() {
        double random = Math.random() * 5;
        random += 1;
        return (int) random;

    }
}

