import java.sql.SQLOutput;

public class WhileloopQues3 {
    public static void main(String[] args) {
        System.out.println("Roll both the dices");
        diceRollIng();

    }

    public static void diceRollIng() {

       double dice1 = Math.random() * 6;
       double dice2 = Math.random() * 6;


       while (dice1 != dice2) {

            dice1 = Math.random() * 6;
            dice2 = Math.random() * 6;

           dice1 = (int) dice1;
           dice2 = (int) dice2;

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }
        System.out.println("You rolled doubles...yay ");


    }
}
