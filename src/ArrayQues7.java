import java.util.Scanner;

public class ArrayQues7 {
    public static void main(String[] args) {

        System.out.println("\nHow many topping do you want on your pizza");
        Scanner sc = new Scanner(System.in);
        int totaToppings = sc.nextInt();

        String[] numberOfToppings = new String[totaToppings];


        System.out.println("\nGreat... Enter your toppings");

        for (int i = 0; i < totaToppings; i++) {
            System.out.print(i + 1 + ".");

            numberOfToppings[i] = sc.next();

        }

        System.out.println("\nThank you! Here are the toppings your ordered");
        for (int j = 0; j <totaToppings; j++) {
            System.out.print(j + 1 + ".");
            System.out.println(numberOfToppings[j]);
        }
    }


}




