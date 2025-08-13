import java.util.Scanner;

public class 16_MaxHandshakesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents;
        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}
