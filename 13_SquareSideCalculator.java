import java.util.Scanner;

public class 13_SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeter, sideLength;
        int sidesOfSquare = 4;

        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        sideLength = perimeter / sidesOfSquare;

        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);

        input.close();
    }
}
