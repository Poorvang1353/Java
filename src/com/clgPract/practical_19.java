//Write a program to show divide by zero error through exception, and also try to catch the exception

package com.clgPract;
import java.io.*;

public class practical_19{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                    "Divided by zero operation cannot possible");
        }
    }
}


