import java.util.Scanner;

public class Javaprdia {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("How many historical figures will you register?");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String[][] database = new String[number][3];
        int count = 0;


        for (int i = 0; i < database.length; i++) {
            System.out.println();

            System.out.print("\tFigure: " + (count = count + 1) + "\n");

            System.out.print("\t-Name: ");
            database[i][0] = sc.next();
            System.out.print("");

            System.out.print("\t-Date of birth(d/m/y): ");
            database[i][1] = sc.next();
            System.out.print("");

            System.out.print("\t-Occupation: ");
            database[i][2] = sc.next();
            System.out.print("");
        }
        System.out.println("\nThese are the values you stored:");
        print2dArray(database);
        System.out.println();

        System.out.print("\nWhat do you want information for?");
        String name = sc.next();
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("Name: " + database[i][0]);
                System.out.println("Date of Birth: " + database[i][1]);
                System.out.println("Occucpation: " + database[i][2]);


            }else{
                System.out.println("Error 404");
            }
        }
    }

    public static void print2dArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }

        }
    }
}