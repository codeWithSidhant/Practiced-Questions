package BasicMathsPlacementEx1;

public class CountDigits {
    public static void main(String[] args) {
        int n = 23;
        int count = 0;
        int x = n;
        while (n >= 10) {

            int mod = n % 10;
            if ( mod !=0 && x % mod == 0) {
                count++;
            }
            n = n / 10;
        }
        if (x % n == 0) {
            count++;
        }
        System.out.println(count);

    }
}
