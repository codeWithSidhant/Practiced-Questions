package ArrayPlacementEx5;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        System.out.println(arraySortedOrNot(arr));
    }

    public static boolean arraySortedOrNot(int[] arr) {
        boolean flag = true;
            int i =0;
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i] < arr[j] || arr[i]==arr[j]) {
                    flag=true;
                    i++;
                } else {
                    flag=false;
                    break;
                }
            }return flag;
        }
    }

