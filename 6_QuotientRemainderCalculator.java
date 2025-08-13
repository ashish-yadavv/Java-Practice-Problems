import java.util.Scanner;

public class 6_QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);

        input.close();
    }
}
