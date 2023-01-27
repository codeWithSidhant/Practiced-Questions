import java.util.Arrays;

public class ArrayQues8 {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        System.out.print("Celsius: ");
        for (int i = 0; i < celsius.length; i++) {
            System.out.print(celsius[i] + "'c   ");
        }

        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        System.out.println();
        System.out.print("fahrenheit: ");
        for (int j = 0; j < celsius.length; j++) {
            fahrenheit[j] = (fahrenheit[j] * 9 / 5) + 32;
            System.out.print(fahrenheit[j] + "'F  ");

        }


    }
}
