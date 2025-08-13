import java.util.Scanner;

public class 2_TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseCm, heightCm;
        double cmToInchFactor = 2.54;

        System.out.print("Enter base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;
        double areaInch = areaCm / (cmToInchFactor * cmToInchFactor);

        System.out.println("The Area of the triangle in sq in is " + areaInch +
                           " and sq cm is " + areaCm);

        input.close();
    }
}
