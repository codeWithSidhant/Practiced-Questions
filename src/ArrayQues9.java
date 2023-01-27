import java.util.Arrays;

public class ArrayQues9 {
    public static void main(String[] args) {
        double[][] value = {
                {8.76,8.99,6.76,7.78,8.95},
                {5.67,6.78,4.78,8.67,7.89},
                {7.88,8.67,7.67,9.8,8.97}
        };
        System.out.println();

        for(int i=0; i<value.length;i++){
            System.out.print("\n");
            switch (i){
                case 0:{
                    System.out.print("Baking:  ");
                    break;
                }
                case 1:{
                    System.out.print("Cooking: ");
                    break;
                }
                  case 2:{
                    System.out.print("Cereal:  ");
                    break;
                }
            }
            for(int a=0;a<value[i].length;a++){
                System.out.print(value[i][a]+" ");
            }
        }
    }
}
