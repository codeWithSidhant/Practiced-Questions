import java.util.Scanner;

public class PokerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIt's like Poker, but a lot simpler.");
        System.out.println("- \nThere are two players, you and the computer.\n" +
                "- The dealer will give each player one card.\n" +
                "- Then, the dealer will draw five cards (the river)\n" +
                "- The player with the most river matches wins!\n" +
                "- If the matches are equal, everyone's a winner!\n" +
                "- Ready? Type anything if you are.");

        System.out.println("\nLet's play Pokerito. Type anything when you're ready.\n");
        String entry = sc.nextLine();

        System.out.println("\nHere's your card");
        int yourCard = cardDraw();
        System.out.println("\n" + yourCard);

        System.out.println("Here's Computers card");
        int compCard = cardDraw();
        System.out.println("\n" + compCard);


        System.out.println("\n Now dealer wil draw  5 Cards. Press enter to Continue.");

        int yourMatch = 0;
        int computerMatch = 0;


        for (int i = 1; i <= 5; i++) {
            sc.nextLine();
            System.out.println("\nCard:" + i);
            int draw = cardDraw();
            System.out.println("\n" + draw);

            if (yourCard == draw) {
                yourMatch++;
            } else if (compCard == draw) {
                computerMatch++;
            }


        }
        System.out.println("Your number of matches are: " + yourMatch);
        System.out.println("Computer number of matches are: " + computerMatch);
        if (yourMatch > computerMatch) {
            System.out.println("\nYou win");
        }
        if (yourMatch < computerMatch) {
            System.out.println("Computer Wins");
        } else if (yourMatch == computerMatch) {
            System.out.println("Both Wins");
        }


    }


    public static int cardDraw() {


        double Card = Math.random() * 13;
        Card += 1;
        int CardNumb = (int) Card;

        switch (CardNumb) {

            case 1:
                System.out.println(
                        "  |A _  |\n" +
                                "  | ( ) |\n" +
                                "  |(_'_)|\n" +
                                "  |  |  |\n" +
                                "  |____V|\n");
                break;

            case 2:
                System.out.println(
                        "|2    |\n" +
                                "|  o  |\n" +
                                "|     |\n" +
                                "|  o  |\n" +
                                "|____Z|");
                break;

            case 3:
                System.out.println(
                        "|3    |\n" +
                                "|  o  |\n" +
                                "|     |\n" +
                                "|  o  |\n" +
                                "|____3|");
                break;
            case 4:
                System.out.println(
                        "  |4 _  |\n" +
                                "  |  0  |\n" +
                                "  |0   0|\n" +
                                "  |  0  |\n" +
                                "  |____4|");
                break;

            case 5:
                System.out.println(
                        "  |5 _  |\n" +
                                "  |  0  |\n" +
                                "  |0 0 0|\n" +
                                "  |  0  |\n" +
                                "  |____5|");
                break;

            case 6:
                System.out.println(
                        "  |6 _  |\n" +
                                "  | 0 0 |\n" +
                                "  | 0 0 |\n" +
                                "  | 0 0 |\n" +
                                "  |____6|\n");

                break;
            case 7:
                System.out.println(
                        "  |7 _  |\n" +
                                "  | 0 0 |\n" +
                                "  |0 0 0|\n" +
                                "  | 0 0 |\n" +
                                "  |____7|\n");
                break;
            case 8:
                System.out.println(
                        "  |8 _  |\n" +
                                "  |0 0 0|\n" +
                                "  | 0 0 |\n" +
                                "  |0 0 0|\n" +
                                "  |____8|\n");
                break;
            case 9:
                System.out.println(
                        "  |9 _  |\n" +
                                "  |0 0 0|\n" +
                                "  |0 0 0|\n" +
                                "  |0 0 0|\n" +
                                "  |____9|\n");
                break;
            case 10:
                System.out.println(
                        "  |10   |\n" +
                                "  | ( ) |\n" +
                                "  |(1 0)|\n" +
                                "  | ( ) |\n" +
                                "  |___10|\n");
                break;
            case 11:
                System.out.println(
                        "  |K _  |\n" +
                                "  | ( ) |\n" +
                                "  |( K )|\n" +
                                "  |  |  |\n" +
                                "  |____K|\n");
                break;
            case 12:
                System.out.println(
                        "  |Q _  |\n" +
                                "  | ( ) |\n" +
                                "  |( Q )|\n" +
                                "  | | | |\n" +
                                "  |____Q|\n");
                break;
            case 13:
                System.out.println(
                        "  |J _  |\n" +
                                "  | ||| |\n" +
                                "  |( J )|\n" +
                                "  | ||| |\n" +
                                "  |____J|\n");
                break;


            }

       return CardNumb; }

    }
