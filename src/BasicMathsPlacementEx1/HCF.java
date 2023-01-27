package BasicMathsPlacementEx1;

public class HCF {
    public static void main(String[] args) {
        long a = 5;
        long b = 10;
        long hcf = 0;
        long lcm = 0;

        if ((a == 1 && b == 1)) {
            lcm = 1;
            hcf = 1;
        } else {
            long x = Math.max(a, b);
            for (int i = 2; i < x; i++) {
                if (a % i == 0 && b % i == 0) {
                    hcf = i;
                }
            }
        }
        lcm = (a * b) / hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }
}
