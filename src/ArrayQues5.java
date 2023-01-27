import java.util.Arrays;

public class ArrayQues5 {
    public static void main(String[] args) {

        String[] menu ={"espresso","ice coffee","macchiato"};
        menu[2]= "latte";

        String [] newMenu= new String[5];

        for(int i=0; i<menu.length;i++){
            newMenu[i]= menu[i];
        }
        newMenu[3]="myspecial";
        newMenu[4]="whatever";
        System.out.println(Arrays.toString(newMenu));

    }
}
