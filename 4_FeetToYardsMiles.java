import java.util.Scanner;

public class 4_FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distanceInFeet;
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}
