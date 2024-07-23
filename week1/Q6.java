import java.util.Scanner;

public class GradeAssigner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your exam score: ");
        int score = scanner.nextInt();

        String grade;

        switch (score / 10) {
            case 10:
            case 9:
                grade = "A (Excellent)";
                break;
            case 8:
                grade = "B (Very Good)";
                break;
            case 7:
                grade = "C (Good)";
                break;
            case 6:
                grade = "D (Satisfactory)";
                break;
            default:
                grade = "F (Fail)";
        }

        System.out.println("Your grade is: " + grade);
    }
}
