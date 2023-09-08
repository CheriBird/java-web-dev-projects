package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Double RectLength;
        Double RectWidth;
        Double RectArea;

        Scanner inputLength = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        RectLength = inputLength.nextDouble();

        Scanner inputWidth = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        RectWidth = inputWidth.nextDouble();

        RectArea = RectLength * RectWidth;
        System.out.println("The area of the rectangle is: " + RectArea);

        inputLength.close();
//        inputWidth.close();
    }
}
