package com.clgPract;

import java.util.Scanner;

public class Recursion_factorial {
    static int factorial(int n){
        if (n==0 || n==1)
            return 1;
        else
            return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int x = sc.nextInt();
        System.out.printf("The factorial of %d is: ",x);
        System.out.print(factorial(x));
    }
}
