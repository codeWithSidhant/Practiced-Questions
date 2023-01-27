package RecursionPlacementEx2;

public class PrintNumber {
    public static void main(String[] args) {
        numb(10);

    }

    public static void numb(int count) {
        if (count < 1) {
            return;
        } else {
            numb(count - 1);
            System.out.print(count + " ");

        }

    }

}
