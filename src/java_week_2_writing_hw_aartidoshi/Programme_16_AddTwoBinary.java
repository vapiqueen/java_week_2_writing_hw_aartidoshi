package java_week_2_writing_hw_aartidoshi;

import java.util.Scanner;

/**Write a Java program to add two binary numbers.

 *Input Data:
 *Input first binary number: 10
 *Input second binary number: 11
 *Expected Output:
 *Sum of two binary numbers: 101
 */
public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to java program to add two binary number");
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = scanner.nextLine();
        System.out.println("Please enter second binary number");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumber(first,second);
        System.out.println("The addition of two binary number is :" + addition);
        //closing the scanner object
        scanner.close();
    }
    //Adding the two Binary Numbers
    public static String addTwoBinaryNumber(String first,String second){
        int b1 = Integer.parseInt(first,2);
        int b2 = Integer.parseInt(second,2);
        int sum =b1 + b2;
        return Integer.toBinaryString(sum);
    }
}
