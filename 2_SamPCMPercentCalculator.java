public class 2_SamPCMPercentCalculator {
    public static void main(String[] args) {
        double marksMaths = 94;
        double marksPhysics = 95;
        double marksChemistry = 96;
        double totalSubjects = 3;

        double averageMarks = (marksMaths + marksPhysics + marksChemistry) / totalSubjects;

        System.out.println("Sam’s average mark in PCM is " + averageMarks);
    }
}
