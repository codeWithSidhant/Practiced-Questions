public class ArrayQues1 {
    public static void main(String[] args) {
        int[] seat = {0, 1, 2, 3, 4};
        System.out.println("Harry will take seat " + seat[0]);
        System.out.println("Sidhant will take seat " + seat[1]);
        System.out.println("Seema will take seat " + seat[2]);
        System.out.println("Sahil will take seat " + seat[3]);
        System.out.println("Kamlesh will take seat " + seat[4]);

        /*
         * LOOP in Array:=
         * */

        for (int i = 0; i < seat.length; i++) {
            System.out.println(seat[i]);
        }

        String[] name = {"Sidhant", "kamlesh", "sahil", "satish"};

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + ", is seating on seat " + i);
        }

    }
}
