import java.util.Scanner;

public class 12_TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height, areaInches, areaCm;
        double cmToInchFactor = 2.54;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        areaCm = 0.5 * base * height;
        areaInches = areaCm / (cmToInchFactor * cmToInchFactor);

        System.out.println("Area of triangle is " + areaCm + " square cm and " + areaInches + " square inches");

        input.close();
    }
}
