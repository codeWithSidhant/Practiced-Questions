import java.util.Scanner;

public class WhileLoopQues2 {
    public static void main(String[] args) {



        System.out.println("Enter Username and Password");
        entry();



    }

    public static void entry() {
    ;

        Scanner sc = new Scanner(System.in);
        String password = "";
        String user="";

        while (!password.equals("Java>") && !user.equals("sidhant12_") ) {


            System.out.print("\nUsername: ");
             user = sc.next();

            System.out.print("Password: ");
            password = sc.next();

            if(!password.equals("Java>") && !user.equals("sidhant12_")){
                System.out.println("Incorrect Username and Password... try again, ");
            }


            }
        System.out.println("Sign in successful.... Welcome,");
        }






    }


