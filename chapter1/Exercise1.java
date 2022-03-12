package chapter1;
import java.util.Scanner;

/**
 * Write the program that takes as input
 * three numbers and print the sum of the first two numbers
 * multiplied by the third number to the screen.
 * (Assume that the three numbers are of type double.)
 * 
 */
public class Exercise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first numer: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second numer: ");
        double num2 = input.nextDouble();

        System.out.print("Enter third numer: ");
        double num3 = input.nextDouble();
        input.close();

        double firstSum = num1 + num2;
        double product = firstSum * num3;

        System.out.println();

        System.out.println("The sum of " + num1 + " and " + num2 + " multiplied by " + num3 + " is: " + product);
    }

}