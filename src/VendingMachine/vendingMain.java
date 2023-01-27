import VendingMachine.*;

import java.util.Scanner;

public class vendingMain {
    public static void main(String[] args) {
        ColdDrinks[][] coldDrinks = new ColdDrinks[][]{
                {new ColdDrinks("Pepsi", 1.99, 3), new ColdDrinks("Fresca", 1.49, 3), new ColdDrinks("Brisk", 2.49, 2)},
                {new ColdDrinks("Fanta", 1.99, 2), new ColdDrinks("Barq's", 1.49, 2), new ColdDrinks("A & W", 2.49, 3)},
                {new ColdDrinks("Crush", 1.99, 2), new ColdDrinks("C-Cola", 1.49, 2), new ColdDrinks("Berry", 2.49, 1)}
        };
        Scanner sc = new Scanner(System.in);
        Store store = new Store(coldDrinks);
        System.out.println("\n\n\n");
        System.out.println("\t**********************************************************");
        System.out.println("                      WELCOME TO JAVA DRINKS         ");
        System.out.println("\t**********************************************************");
        System.out.println(store);
        System.out.println("\t**********************************************************");


        while (true) {

            System.out.print("\n\tPick up a Row:");
            int row = sc.hasNextInt() ? sc.nextInt() : 404;
            sc.hasNextLine();

            System.out.print("\tPick up a Spot in a Row:");
            int spot = sc.hasNextInt() ? sc.nextInt() : 404;
            sc.hasNextLine();

            if (row == 404 || spot == 404) {
                System.out.println("INVALID INPUT");
                break;
            } else if (row < 0 || row > store.getRowLength()- 1 || spot < 0 || spot > store.getLength() - 1) {
                System.out.println("\nINVALID INDEX (Enter again) ");
                continue;
            } else if (store.getColdDrinks(row, spot).getQuantity() == 0) {
                System.out.println("EMPTY SlOT");
                continue;
            }

            store.sell(row, spot);
            System.out.println(store);

        }
    }
}
