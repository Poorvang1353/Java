//Write a program to find length of string and print second half of the string

package com.clgPract;

import java.util.*;
public class practical_10
{
    public static void main(String m[])
    {
        Scanner in=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a String :");
        s=in.next();
        int l=s.length();
        System.out.println("Length of the string "+s+" is "+l);
        System.out.println("Your sub String is:"+s.substring(l/2));
    }
}