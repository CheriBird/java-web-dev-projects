package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
//        Double Miles;
//        Double Gallons;
//        Double MPG;

//        Scanner inputMiles = new Scanner(System.in);
//        Scanner inputGallons = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
//        Double Miles = inputMiles.nextDouble();
        Double Miles = input.nextDouble();
        System.out.println("How many gallons of gas were consumed?");
//        Double Gallons = inputGallons.nextDouble();
        Double Gallons = input.nextDouble();
        Double MPG = Miles / Gallons;
        System.out.println("Your Miles Per Gallon (MPG) were: " + MPG);

//        inputMiles.close();
//        inputGallons.close();
        input.close();

    }

}
