

class areaCalculation<measureRectangle> {
    public static void main(String[] args) {
        double m1 = measureRectangle(5.8, 6.6, "area");
        double m2 = measureRectangle(4, 7.8, "perameter");
        double m3 = measureRectangle(56.3, 45.7, "area");

        stringFuction(5.8, 6.6, m1,"Area");

        stringFuction( 4, 7.8, m2,"Perameter");

        stringFuction(55.3, 45.7, m3,"Area");
    }

    public static void stringFuction(double length, double breadth, double solution, String Option) {
        System.out.println( Option+ " of Rectangle with length " + length + " and breadth " + breadth + " is " + solution + ".");
    }

    public static double measureRectangle(double length, double breadth, String Option) {

        if (length < 0 || breadth < 0) {
            System.out.println("Answer not found");
            System.exit(0);
        }
        if ("area".equals(Option)) {
            return length * breadth;
        } else if ("perameter".equals(Option)) {
            return 2 * (length + breadth);
        }
        return 404;


    }
}

