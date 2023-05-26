package java_week_2_writing_hw_aartidoshi;

import java.util.Scanner;

/** Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r).
 */
public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {

    //Scanner decalration for reading input from console
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Radius : ");
    double radius = scanner.nextDouble();
    areaOfCircle(radius);
    //closeing the scanner object
    scanner.close();
}
//Calculating the area of circle
public static void areaOfCircle(double radius) {
    double pi =Math.PI;
    double area = (pi * radius * radius);
    System.out.println("The Area of Circle is:" + area);
}
}



