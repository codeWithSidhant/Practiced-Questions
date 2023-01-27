
import Dealership.*;

import java.util.Scanner;

public class carMain {


    public static void main(String[] args) {
        Car[] cars = new Car[]{

                new Car("Nissan", 2000),
                new Car("Mclaren", 4000),
                new Car("Pagani", 5000),
        };

        Store store = new Store(cars);
        store.setCars(1, new Car("Maruti", 2334));
        cars[0].setBrand("Nissan");
        cars[0].setPrice(50000.56);

        cars[1].setBrand("Mercedes");
        cars[1].setPrice(500.56);

        cars[2].setBrand("redbull");
        cars[2].setPrice(500);


        Scanner sc = new Scanner(System.in);


        System.out.println("***************JAVA DEALERSHIP**************");

        while (true) {
            System.out.println(store);
            if (store.isEmpty()) {
                System.out.println("No car left to sell");
                break;
            }
            System.out.print("Enter the spot number of the car which you are intrested in : ");

            if (!sc.hasNextInt()) {
                sc.hasNextLine();
                System.out.println("INVALID INPUT");
                break;
            }

            int spot = sc.nextInt();
            sc.hasNextLine();

            if (spot < 0 || spot > store.getLength() - 1) {
                System.out.println("INVALID INDEX");
                continue;
            }
            if (store.getCars(spot) == null) {
                System.out.println("EMPTY SPOT");
                continue;
            }
            store.Sell(spot);
        }
    }
}
