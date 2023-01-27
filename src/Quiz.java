import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);

        System.out.println("Question 1: Which country held the 2016 Summer Olympics?");
        System.out.println("a) China.\n" +
                "b) India.\n" +
                "c) Brazil.\n" +
                "d) Italy");
        String ans1 = answer.next();

        System.out.println("Question 2: Which planet is the hottest?");
        System.out.println("a) Venus\n" +
                "b) Saturn\n" +
                "c) Mercury\n" +
                "d) Mars");
        String ans2 = answer.next();

        System.out.println("What is the rarest blood type?");
        System.out.println("a) O\n" +
                "b) A\n" +
                "c) B\n" +
                "d) AB-Negative");
        String ans3 = answer.next();


        int score = 0;

        if (ans1.equals("c")) {
            score= score+ 5;
        }
        if (ans2.equals("a")) {
            score= score+ 5;
        }
        if (ans3.equals("d")) {
            score= score + 5;
        }

        System.out.println("\nYour Total score is :" +score);

        if(score>10){
            System.out.println("\nkeep it up");
        }
        if(score == 5){
                System.out.println("\nNeed some practice");
            }else
                System.out.println("\nwork hard");
        }
    }


