import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // consume newline

            studentNames.add(name);
            studentGrades.add(grade);
        }

        // Calculate statistics
        double total = 0;
        double highest = studentGrades.get(0);
        double lowest = studentGrades.get(0);

        for (double grade : studentGrades) {
            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = total / studentGrades.size();

        // Display Summary Report
        System.out.println("\n===== Summary Report =====");
        System.out.printf("%-20s %-10s%n", "Student Name", "Grade");

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.printf("%-20s %-10.2f%n",
                    studentNames.get(i),
                    studentGrades.get(i));
        }

        System.out.println("\nStatistics");
        System.out.println("Average Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        sc.close();
    }
              }
