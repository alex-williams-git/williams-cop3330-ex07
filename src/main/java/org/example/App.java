/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        final double conversion_factor = 0.09290304;

        System.out.print("What is the length of the room in feet? ");
        int length = Integer.parseInt(scan.nextLine());

        System.out.print("What is the width of the room in feet? ");
        int width = Integer.parseInt(scan.nextLine());

        int area_feet = length * width;
        double area_meter = area_feet * conversion_factor;

        System.out.println("The room dimensions entered are " + length + " feet by " + width + " feet.");
        System.out.println("The area in feet: " + area_feet + " square feet.");
        System.out.println("The area in meters: " + area_meter + " square meters.");
    }
}
