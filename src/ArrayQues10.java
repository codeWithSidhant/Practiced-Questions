public class ArrayQues10 {
    public static void main(String[] args) {

        int[][] randomArray = new int[10][10];

        for (int i = 0; i < randomArray.length; i++) {
            System.out.println("  \b  ");
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j]=RandomNumber();
                System.out.print(randomArray[i][j] + " ");

            }
        }
    }

    public static int RandomNumber() {
        double random = Math.random() * 100;
        random += 1;
        return (int) random;
    }


}
