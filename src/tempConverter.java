public class tempConverter {
    public static void main(String[] args) {

        double noon = tempratureInFahrenheit(90.90);
        double morning = tempratureInFahrenheit(77.76);
        double night = tempratureInFahrenheit(67);

        System.out.println("temp in morning is:" +morning);
        System.out.println("temp in noon is:" +noon);
        System.out.println("temp in night is:" +night);

    }

    private static double tempratureInFahrenheit(double fahrenheit) {
        double celsius;
        celsius = (fahrenheit - 32) *  5 / 9;
        return celsius;
    }
}




