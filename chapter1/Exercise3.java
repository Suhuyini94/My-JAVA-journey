package chapter1;
import java.util.Scanner;

/**
 * Write a program that reads a student's name followed by five test scores.
 * The program should output the student name, the five test scores, and the
 * average test score.
 * Display the name on the first line, scores on the same line on the second
 * line then on the third line the average.
 * 
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String nameOfStudent = inputScanner.nextLine();

        System.out.print("Enter student's score for test 1: ");
        double test1 = inputScanner.nextDouble();

        System.out.print("Enter student's score for test 2: ");
        double test2 = inputScanner.nextDouble();

        System.out.print("Enter student's score for test 3: ");
        double test3 = inputScanner.nextDouble();

        System.out.print("Enter student's score for test 4: ");
        double test4 = inputScanner.nextDouble();

        System.out.print("Enter student's score for test 5: ");
        double test5 = inputScanner.nextDouble();

        inputScanner.close();

        double sumOfScores = test1 + test2 + test3 + test4 + test5;
        double average = sumOfScores / 5;
        
        System.out.println();
        System.out.println();
        System.out.println(nameOfStudent);
        System.out.println("Test Scores: " + test1 + "  " + test2 + "  " + test3 + "  " + test4 + "  " + test5);
        System.out.println("Average Score: " + average);

    }

}