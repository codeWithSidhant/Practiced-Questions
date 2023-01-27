import java.util.Arrays;

public class ArrayQues6 {
    public static void main(String[] args) {
        double[] beforeTax= {1.99,2.99, 3.99,4.99};

        double[] afteTax = new double[4];


        for(int i=0; i<beforeTax.length;i++){
            System.out.println("\nprices before taxes:"+beforeTax[i]);

            afteTax[i]= beforeTax[i]+ (0.13*beforeTax[i]);
            System.out.println("prices after taxes:" +afteTax[i]);

        }



    }
}
