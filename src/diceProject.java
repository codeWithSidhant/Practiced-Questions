
import java.util.Scanner;

public class diceProject {

    public static void main(String[] args) {
        System.out.println("choose 3 random numbers between 1 to 6");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Number1");
        int numb1 = sc.nextInt();

        System.out.println("\nEnter Number2");
        int numb2 = sc.nextInt();

        System.out.println("\nEnter Number3");
        int numb3 = sc.nextInt();

        if(numb1<1||numb2<1||numb3<1){
            System.out.println("Number less than 1 or greater than 6 will not be accepted. Shutting down game.");
            System.exit(0);
        }
        if(numb1>6||numb2>6||numb3>6){
            System.out.println("Number less than 1 or greater than 6 will not be accepted. Shutting down game.");
            System.exit(0);
        }

        int sum1 = numb1 + numb3 + numb2;


        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("\nOn roll 1 we got " + roll1);
        System.out.println("On roll 2 we got " + roll2);
        System.out.println("On roll 3 we got " + roll3);
        int sum2 = roll1 + roll2 + roll3;

        if (sum2 >= sum1 && (sum1 - sum2 < 3)) {
            System.out.println("\nYou Won the game.... Congratulations");
        } else {
            System.out.println("\n3You Lost the game.... Better Luck next time");
        }
    }


    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;

    }
}
