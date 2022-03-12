package chapter1;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the weight of a person in kilograms
 * and outputs the equivalent weight in pounds.
 * Output both the weights, saying, X weights is Y Pounds . (Note that 1 kilogram = 2.2 pounds.)

 */
public class Exercise2 {
public static void main(String[] args) {
    Scanner weight = new Scanner(System.in);

    System.out.print("Enter your weight in kg: ");
    double weightInKg = weight.nextDouble();
    weight.close();

    double weightInPounds = weightInKg * 2.2;

    System.out.println(weightInKg + " kilograms is " + weightInPounds + " pounds.");
}
    
}