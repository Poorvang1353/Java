//Write a program to find that given number or string is palindrome or not

package com.clgPract;

import java.util.Scanner;

public class practical_11 {
    public static void main(String[] args) {
        int rev, sum=0, temp;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        temp=n;

        while (n!=0){
            rev=n%10;
            sum=(sum*10)+rev;
            n= n/10;
        }

        if (temp==sum)
            System.out.printf("%d is Palindrome number", temp);
        else
            System.out.printf("%d is not Palindrome number", temp);

    }
}
