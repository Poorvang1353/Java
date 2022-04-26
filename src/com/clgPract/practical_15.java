/*Write a java program to find out the volume of rectangular box and volume of cub
 using the concept of constructor overloading.*/

package com.clgPract;

import java.util.Scanner;

class volume{
    double a,b,c;
    public volume(double a){
        System.out.println("Volume of cube: " + (a*a*a));
    }

    public volume(double a, double b, double c){
        System.out.println("Volume of Rectangular Box: " + (a*b*c));
    }
}

public class practical_15 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of cube: ");
        a = s.nextDouble();
        volume obj = new volume(a);
        System.out.println("Enter the length, width and height of the rectangular box: ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        volume obj_2 = new volume(a,b,c);


    }
}
