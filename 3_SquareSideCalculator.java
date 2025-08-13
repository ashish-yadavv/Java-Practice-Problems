import java.util.Scanner;

public class 3_SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeter;
        int sidesOfSquare = 4;

        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        double sideLength = perimeter / sidesOfSquare;

        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);

        input.close();
    }
}
