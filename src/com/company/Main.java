package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Indtast et tal som radius");



    Scanner input = new Scanner(System.in);

    double radius = 0;

    radius = input.nextDouble();

    System.out.println("Radius er " + radius);

    double areal = 0;

    areal = radius * radius * 3.14;

    System.out.println("Arealet er " + areal);

    }



    
}
