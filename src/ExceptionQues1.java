public class ExceptionQues1 {
    public static void main(String[] args) {
        int random = Random(15);
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite :" +isPrime(random));

    }

    public static int Random(int range) {
        int random = (int)(Math.random()*range)+ 1;
        return random;
    }

    public static String isPrime(int random) {

        String isPrime = "Prime";
        if(random==1){
            isPrime="Neither";

        }
        for (int i = 2; i < random; i++) {
            if (random % i == 0){
                isPrime="Composite";
                break;
            }
        }
        return isPrime;
    }
}