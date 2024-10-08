import java.util.Scanner;

public class SchoolResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String schoolName = "New School of Learning";
        String className = "Class XI";

        String[] students = new String[3];
        double[][] marks = new double[3][3]; 

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
            System.out.println("Enter marks out of 50 for " + students[i] + ":");

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Mathematics: ");
            marks[i][2] = sc.nextDouble();

            sc.nextLine();
        }

        int studentIndex = 0;
        displayIndividualResult(schoolName, className, students[studentIndex], marks[studentIndex]);
        generateClassSummary(marks);
    }

    public static void displayIndividualResult(String schoolName, String className, String studentName, double[] marks) {
        double totalMarks = 0;
        double maxMarks = 150;
        String[] subjects = {"Physics", "Chemistry", "Mathematics"};

        System.out.println("\n" + schoolName);
        System.out.println(studentName + " - " + className);
        System.out.println("----------------------------------");
        System.out.println("Subject      Marks Obtained    % Marks");
        System.out.println("----------------------------------");

        for (int i = 0; i < marks.length; i++) {
            double percentage = (marks[i] / 50) * 100;
            totalMarks += marks[i];
            System.out.printf("%-12s %15.2f %12.2f%%\n", subjects[i], marks[i], percentage);
        }

        double totalPercentage = (totalMarks / maxMarks) * 100;
        System.out.println("----------------------------------");
        System.out.printf("Total Marks: %6.2f / %.2f\n", totalMarks, maxMarks);
        System.out.printf("Total Percentage: %.2f%%\n", totalPercentage);
        System.out.println("----------------------------------");
    }

    public static void generateClassSummary(double[][] marks) {
        double physicsTotal = 0, chemistryTotal = 0, mathematicsTotal = 0;
        int numStudents = marks.length;

        for (int i = 0; i < numStudents; i++) {
            physicsTotal += marks[i][0];
            chemistryTotal += marks[i][1];
            mathematicsTotal += marks[i][2];
        }

        double physicsAverage = physicsTotal / numStudents;
        double chemistryAverage = chemistryTotal / numStudents;
        double mathematicsAverage = mathematicsTotal / numStudents;
        double overallAverage = (physicsTotal + chemistryTotal + mathematicsTotal) / (numStudents * 3);

        System.out.println("\nClass Summary:");
        System.out.println("----------------------------------");
        System.out.printf("Average Marks in Physics: %.2f / 50\n", physicsAverage);
        System.out.printf("Average Marks in Chemistry: %.2f / 50\n", chemistryAverage);
        System.out.printf("Average Marks in Mathematics: %.2f / 50\n", mathematicsAverage);
        System.out.printf("Overall Class Average: %.2f / 50\n", overallAverage);
        System.out.println("----------------------------------");
    }
}

