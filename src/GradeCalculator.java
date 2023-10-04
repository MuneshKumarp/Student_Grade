import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello Welcome To The Student Grade Calculator");
        System.out.println("Enter The Numbers of Subjects");
        int Subject= sc.nextInt();
        double[] mark=new double[Subject];
        for (int i=0;i<Subject;i++){
            System.out.println("Enter Marks in Subject"+(i+1)+"(Out of 100)");
            mark[i]= sc.nextDouble();
        }
        double total=0;
        for (double marks:mark){
            total +=marks;
        }
        double averagePercentage = (total / (Subject * 100)) * 100;

        // Step 4: Grade Calculation
        String grade;
        if (averagePercentage >= 94) {
            grade = "A++";
        } else if (averagePercentage >= 85) {
            grade = "A+";
        } else if (averagePercentage >= 76) {
            grade = "A";
        } else if (averagePercentage >= 68) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Step 5: Display Results
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);


    }
}