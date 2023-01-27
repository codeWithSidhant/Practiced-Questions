public class ArrayQues4 {
    public static void main(String[] args) {

        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] prices = {2.11, 1.78, 1.99};

        for (int i = 0; i < apples.length; i++) {
            for (int j = 0; j < prices.length; j++) {

                System.out.println(apples[i] + " : $ " + prices[j]);
                i++;

            }
        }
    }
}

