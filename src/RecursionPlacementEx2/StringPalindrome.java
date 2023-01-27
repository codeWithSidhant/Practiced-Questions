package RecursionPlacementEx2;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "123321";

        char[] arr = str.toCharArray();
        int n = arr.length;
        for (int i = 0; i <= arr.length; i++) {

        }
        function(0, n, arr);

        boolean ans = function(0, n, arr);

        if (ans == true) {
            System.out.println("Yes, its a palindrome");
        } else {
            System.out.println("No, its not a palindrome");
        }
    }

    public static boolean function(int i, int n, char[] arr) {
        if (i >= (n / 2)) {
            return true;
        }
        if (arr[i] != arr[n - 1 - i]) {
            return false;
        } else {
            function(i + 1, n, arr);
            return true;
        }
    }
}
