package com.clgPract;

import java.util.*;

public class Rupees {
    public static void main(String[] args) {
        double rupees;
        System.out.println("Enter the value of rupees: ");
        Scanner in = new Scanner(System.in);
        rupees = in.nextDouble();
        double dollar = rupees/70;
        System.out.println("Dollars= "+dollar);
    }
}
