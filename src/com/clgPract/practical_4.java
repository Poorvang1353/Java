//Assume Cramer’s rule to solve equation

package com.clgPract;

import java.util.*;

public class practical_4 {
    public static void main(String[] args) {
        double a,b,c,d,e,f,x,y;
        System.out.println("Enter eq-1");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = in.nextDouble();
        System.out.println("Enter b: ");
        b = in.nextDouble();
        System.out.println("Enter e: ");
        e = in.nextDouble();
        System.out.println(" "+a+"x + "+b+"y="+e);

        System.out.println("Enter eq-2");
        System.out.println("Enter c");
        c = in.nextDouble();
        System.out.println("Enter d");
        d = in.nextDouble();
        System.out.println("Enter f");
        f = in.nextDouble();
        System.out.println(" "+c+"x + "+d+"y="+f);
        x=((a*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("X="+x+" Y="+y);
    }
}
