package MovieStore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
    static ManagerMovie managerMovie = new ManagerMovie();

    public static void main(String[] args) {

        System.out.println("\n\n******************************************");
        System.out.println("               MOVIE STORE                   \n\n");
        managerMovie.addMovie(new MovieClass("The Shawshank Redemption", "BlueRay", 9.2));
        managerMovie.addMovie(new MovieClass("The Godfather", "BlueRay", 9.1));
        managerMovie.addMovie(new MovieClass("The Godfather Part 2 ", "BlueRay", 9.1));


        managerMovie.sell("The Shawshank Redemption");
        System.out.println(managerMovie);


    }

    public static void loadFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] word= line.split("--");    //SPLIT FUNCTION HELPS TO SPLIT LINE INTO 3 ARRAYS
            managerMovie.addMovie(new MovieClass(word[0],word[1], Double.parseDouble(word[2])));
        }
        sc.close();
    }

    public static void entry() {
        System.out.println("Enter ! To Sell movie\n" +
                "Enter 2 to Rent movie\n" +
                "Enter 3 to Return movie\n" +
                "Enter anything to Exit\n");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        System.out.print("Enter name of movie: ");
        String name = sc.next();
        switch (numb) {
            case 1:
                managerMovie.sell(name);
                break;
            case 2:
                managerMovie.rent(name);
                break;
            case 3:
                managerMovie.Return(name);
                break;
            default:
                sc.close();
        }
        System.out.println(managerMovie);
    }
}