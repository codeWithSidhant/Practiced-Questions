public class ArrayQues3 {
    public static void main(String[] args) {
        int[] score = {323242, 42445672, 432424, 23423, 32, 12};
        int max = score[0];
        int seat = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                seat = i;
            }
        }
        System.out.println(max + " is the highest score.. Congrats  ");
        System.out.println("Gentelman is seating on " + seat + ",give him a cooke");
    }
}
