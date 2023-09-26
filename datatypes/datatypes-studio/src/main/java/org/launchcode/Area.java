package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner inputRadius = new Scanner(System.in);

        // prompt for radius
        System.out.println("Enter a radius:");
        double radius = inputRadius.nextDouble();
        // return the area of the circle
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);

        // TODO get help to know how to stage and commit my work
        // link to the studio:
        // https://education.launchcode.org/java-web-dev-curriculum/data-types/studio/index.html
        // Bonus Missions
        // 2-Use do-while loop to re-prompt if errors are entered
//        do
//        {
//            // 1-Validations: negative num, non-numeric, empty string
//            System.out.println("Enter a radius:");

//            if (inputRadius.hasNextDouble()) {
//                Double radius = inputRadius.nextDouble();
//
//                if (radius < 0) {
//                    System.out.println("The radius must be a positive number. Please re-run calculation.");
//
////                } else if () {
////
////            } else if (radius == null) {
////                System.out.println("Please re-run calculation and enter a valid value for radius.");
//                } else {
//
//
//                    // return the area of the circle
//                    double area = Circle.getArea(radius);
//                    System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
//                }
//            }
//            while (radius < 0);

            inputRadius.close();
    }
}
