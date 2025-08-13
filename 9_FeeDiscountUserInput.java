import java.util.Scanner;

public class 9_FeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee, discountPercent, discountAmount, finalFee;

        System.out.print("Enter the fee: ");
        fee = input.nextDouble();

        System.out.print("Enter the discount percent: ");
        discountPercent = input.nextDouble();

        discountAmount = (discountPercent / 100) * fee;
        finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
