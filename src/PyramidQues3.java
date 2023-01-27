public class PyramidQues3 {
    public static void main(String[] args) {
        char letter = 'a';
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println();
                continue;
            }
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print(letter++);
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
