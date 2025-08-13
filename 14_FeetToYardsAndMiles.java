import java.util.Scanner;

public class 14_FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double feet, yards, miles;
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        yards = feet / feetPerYard;
        miles = yards / yardsPerMile;

        System.out.println("Distance in yards is " + yards + " and in miles is " + miles);

        input.close();
    }
}
