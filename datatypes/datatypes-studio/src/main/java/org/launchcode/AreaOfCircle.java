package org.launchcode;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Double radius;
        Double area;
        Double pi = 3.14;

        // prompt for radius
        Scanner inputRadius = new Scanner(System.in);
        System.out.println("Enter a radius:");
        radius = inputRadius.nextDouble();

        // return the area of the circle
        area = pi * radius * radius;
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
