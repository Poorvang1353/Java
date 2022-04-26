//Write a program that calculates percentage marks of the student if marks of 6 subjects are given

package com.clgPract;

import java.util.*;
public class practical_3{

    public static void main(String[] args) {
        double a,b,c,d,e,f,average;
        System.out.println("Enter your marks");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the marks of sub-1");
        a=in.nextDouble();
        System.out.println("Enter the marks of sub-2");
        b=in.nextDouble();
        System.out.println("Enter the marks of sub-3");
        c=in.nextDouble();
        System.out.println("Enter the marks of sub-4");
        d=in.nextDouble();
        System.out.println("Enter the marks of sub-5");
        e=in.nextDouble();
        System.out.println("Enter the marks of sub-6");
        f=in.nextDouble();
        average=(a+b+c+d+e+f)/6;
        double total=a+b+c+d+e+f;
        double percentage=total*100/600;
        System.out.println("Total="+total +",average="+average + ",com.clgPract.Percentage="+percentage);

    }

}

