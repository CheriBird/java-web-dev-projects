package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        double RectLength;
        double RectWidth;
        double RectArea;

        Scanner inputLength = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        RectLength = inputLength.nextDouble();

        Scanner inputWidth = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        RectWidth = inputWidth.nextDouble();

        RectArea = RectLength * RectWidth;
        System.out.println("The area of the rectangle is: " + RectArea);

/*
        // alternate way to code the above (defines and sets variable values on one line):
        public static void main(String[] args) {
            Scanner len = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle:");
            double length = Double.parseDouble(len.nextLine());
            Scanner wide = new Scanner(System.in);
            System.out.println("Enter the width of the rectangle:");
            double width = Double.parseDouble(wide.nextLine());
            double area = length * width;
            System.out.println("The area of the rectangle is: " + area);
        }
*/

        inputLength.close();
        inputWidth.close();
    }
}
