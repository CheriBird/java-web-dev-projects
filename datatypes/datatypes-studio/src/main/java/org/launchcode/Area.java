package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        // prompt for radius
        Scanner inputRadius = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = inputRadius.nextDouble();

        // return the area of the circle
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

        inputRadius.close();
    }
}
