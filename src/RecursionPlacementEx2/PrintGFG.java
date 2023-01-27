package RecursionPlacementEx2;

public class PrintGFG {
    public static void main(String[] args) {
        caller(10);

    }

    public static void caller(int count) {
        if (count < 1) {
            return;
        } else {
            System.out.print("GFG ");
            count--;
            caller(count);
        }

    }
}
