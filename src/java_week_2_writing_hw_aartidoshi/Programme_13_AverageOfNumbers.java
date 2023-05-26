package java_week_2_writing_hw_aartidoshi;

import java.util.Scanner;

/**13. Write a Java program that takes three numbers as input to calculate and
* print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner =new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Enter the first number");
        double y = scanner.nextDouble();
        System.out.println("Enter the second number");
        double z =scanner.nextDouble();
        averageOfThreeNumbers(x,y,z);
        //closing the scanner object
        scanner.close();
    }
    //calculation the average of the three numbers
    public static void averageOfThreeNumbers(double a,double b,double c){
        double average = (a + b + c )/3;
        System.out.println("The average of " + a + " , " + b + " and " + c +" is :" +average);
    }
}
