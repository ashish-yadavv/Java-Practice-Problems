import java.util.Scanner;

public class 10_HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double heightCm, heightInches, heightFeet;
        double cmToInchFactor = 2.54;
        int inchesPerFoot = 12;

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        heightInches = heightCm / cmToInchFactor;
        heightFeet = heightInches / inchesPerFoot;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);

        input.close();
    }
}
