import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a if you want to buy the car. ");
        System.out.println("\nType b if you want to buy the car. ");
        char option = sc.next().charAt(0);


        switch (option) {

            case 'a':
                System.out.println("\nWhat is your budget? ");
                int budget = sc.nextInt();

                if (budget >= 14000) {
                    System.out.println("We have Nissan Terrano for you at " + budget + " pricing");

                    System.out.println("\nDo you have insurance? Type 'yes'or'no'");
                    String insurance = sc.next();
                    System.out.println("\nDo you have licence? Type 'yes'or'no'");
                    String licence = sc.next();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = sc.nextInt();

                    if (insurance.equals("yes") && licence.equals("yes") && creditScore >= 500) {
                        System.out.println("Congratulaton you eligible to buy a car from us. ");
                    } else {
                        System.out.println("You are not eligible to buy car... We are sorry");
                    }
                } else {
                    System.out.println("Sorry we do not have car your  budget");


                }
                break;

            case 'b':
                System.out.println("\nYou choose to sell the car"); 

                System.out.println("\nWhat is your car valued?");
                int value = sc.nextInt();

                System.out.println("\nHow much price are you expecting for your car");
                int expectatedValue = sc.nextInt();

                if(value>expectatedValue && expectatedValue<30000){
                    System.out.println("\nWe will buy your car. Please bring your car for inspection.");
                }else {
                    System.out.println("\nSorry we can not buy the car.");
                }

                break;
            default:
                System.out.println("Invalid case");

                sc.close();

        }
    }
}





