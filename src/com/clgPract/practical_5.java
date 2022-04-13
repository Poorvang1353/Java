package com.clgPract;

import java.util.Scanner;
public class practical_5 {
    public static void main(String[] args) {
        double meter;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of meter: ");
        meter = in.nextDouble();
        double feet = meter*328084;
        System.out.println("feet: "+feet);
    }
}
