import java.util.Scanner;

public class ArrayQues2 {
    public static void main(String[] args) {

        System.out.println("\nHello, welcome to our store ");

        Scanner sc = new Scanner(System.in);

        String item[] = {"chocolate", "tea", "coffee", "butter", "jam", "milk"};

        System.out.println("\nWhat are you looling for?");
        String object = sc.nextLine();


        for (int i = 0; i < item.length; i++) {
            if (item[i].equals(object)) {
                System.out.println("\n" +object + " is on aisle " + i);
                break;


            }
        }

    }
}
