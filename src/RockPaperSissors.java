import java.util.Scanner;

public class RockPaperSissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter '1' for Rock" +
                "\nEnter '2' for Paper" +
                "\nEnter '3' for Sissor ");


        int entery = sc.nextInt();

        int compDraw = randomDraw();


        if (compDraw == 1) {
            System.out.println("your opponent chose Rock");
        }
       else if (compDraw == 2) {
            System.out.println("your opponent chose Paper");
        }
        else {
            System.out.println("your opponent chose Sissor ");
        }



        // Conditions for Win and Loss//

        if (entery == compDraw) {
            System.out.println("Draw");
        }

        if (entery == 1 && compDraw == 2) {
            System.out.println("lost");
        }
        if (entery == 1 && compDraw == 3) {
            System.out.println("Win");
        }


        if (entery == 2 && compDraw == 1) {
            System.out.println("Win");
        }
        if (entery == 2 && compDraw == 3) {
            System.out.println("lost");
        }


        if (entery == 3 && compDraw == 1) {
            System.out.println("Lost");
        }
        if (entery == 3 && compDraw == 2) {
            System.out.println("Win");
        }


    }


    public static int randomDraw() {


        double rps = Math.random() * 3;
        rps += 1;
        return (int) rps;
        /*
         * if rps=1 then its rock.
         * is rps=2 then its paper.
         * if rps=3 then its sissor.
         * */


    }
}
