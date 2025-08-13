import java.util.Scanner;

public class 8_KmToMilesUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kmToMilesFactor = 1.6;
        double distanceKm, distanceMiles;

        System.out.print("Enter distance in kilometers: ");
        distanceKm = input.nextDouble();

        distanceMiles = distanceKm / kmToMilesFactor;

        System.out.println("The total miles is " + distanceMiles + " mile for the given " + distanceKm + " km");

        input.close();
    }
}
