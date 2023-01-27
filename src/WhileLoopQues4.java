public class WhileLoopQues4 {
    public static void main(String[] args) {
        System.out.println("\nComom lets play.....\n");

        diceRolling();


    }

    public static void diceRolling() {

        double dice = Math.random() * 7;
        dice = (int) dice;
        int count = 0;

        while (dice != 6) {

            dice = Math.random() * 6;
            dice+=1;
            dice = (int) dice;

            if((int)dice==6){
                System.out.println("\nYou scored "+ (int)dice+ " games ends.");
                break;
            }
            else if ((int) dice == 4) {
                System.out.println("\nYou rolled a " + (int)dice + ". Scored 0 points. Keep rolling.... ");
            } else {
                System.out.println("\nYou rolled a " + (int)dice + ". Scored 1 points. Keep rolling.... ");
                count++;
            }



        }
        System.out.println("\nIn total you scored " + count + " points");
        if (count >= 3) {
            System.out.println("Wow, that's Luckey... You win");
        } else {
            System.out.println("Better luck next time.. you lost. ");

        }

    }
}
