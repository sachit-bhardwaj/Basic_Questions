import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        final double INCH_TO_CM = 2.54;

        System.out.print("Enter the radius of the circle in inches: ");
        double radiusInInches = sc.nextDouble();
        double radiusInCm = radiusInInches * INCH_TO_CM;

        double circumference = 2 * PI * radiusInCm;
        double area = PI * radiusInCm * radiusInCm;

        System.out.println("Circumference in cm: " + circumference);
        System.out.println("Area in cm²: " + area);
    }
}

