import java.sql.SQLOutput;
import java.util.Scanner;

public class areaCalculator {
    public static void main(String[] args) {
        System.out.println("Enter '1' to find area of Square");
        System.out.println("Enter '2' to find area of Rectangle");
        System.out.println("Enter '3' to find area of Triangle");
        System.out.println("Enter '4' to find area of Circle");
        double area;

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println("Enter length of Side of square");
                System.out.println("Side:");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of Square of side " + side + " is: " + area);
                break;
            }
            case 2: {
                System.out.println("Enter length & Width of Rectangle");
                System.out.println("Length:");
                double length = sc.nextDouble();
                System.out.println("Width:");
                double width = sc.nextDouble();
                area = length * width;
                System.out.println("Area of Rectangle of Length " + length + "and Width " + width + " is : " + area);
                break;
            }
            case 3: {
                System.out.println("Enter Height & Base of Triangle");
                System.out.println("Height:");
                double height = sc.nextDouble();
                System.out.println("Base:");
                double base = sc.nextDouble();
                area = 0.5 * height * height;
                System.out.println("Area of Trangle of Height " + height + "and Base " + base + " is: " + area);
                break;

            }
            case 4: {
                System.out.println("Enter Radius of side of Circle");
                System.out.println("Radius:");
                double radius = sc.nextDouble();
                area = 3.14 * radius * radius;
                System.out.println("Area of Circle of Radius " + radius + " is: " + area);
                break;
            }
            default: {
                System.out.println("Erorr 404");
            }


        }
    }
}
