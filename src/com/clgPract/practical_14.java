//Write a java program to find out the area of circle and area of rectangle using the concept of method overloading.


package com.clgPract;

import java.util.*;
class Area {
    void circle() {
        double redius;
        System.out.println("Enter the redius of circle: ");
        Scanner sc = new Scanner(System.in);
        redius = sc.nextDouble();
        double area = 3.14 * redius * redius;
        System.out.println("The area of the circle is " + area + " sq units");
    }

    void rectangle() {
        double width;
        double height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of Rectangle: ");
        width = sc.nextDouble();
        System.out.println("Enter the height of Rectangle: ");
        height = sc.nextDouble();
        double area = width * height;
        System.out.println("The area of the Rectangle is " + area + " sq units");
    }
}

public class practical_14 {
    public static void main(String[] args) {
        Area cir = new Area();
        Area reg = new Area();
        cir.circle();
        reg.rectangle();
    }
}
