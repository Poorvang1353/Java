//Write a program that prompts the user to enter three integers and display the integers in decreasing order

package com.clgPract;

import java.util.Scanner;
public class practical_7
{

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int no1,no2,no3,temp;
        System.out.println("Enter no1: ");
        no1=in.nextInt();
        System.out.println("Enter no2: ");
        no2=in.nextInt();
        System.out.println("Enter no3: ");
        no3=in.nextInt();

        if(no2<no1 || no3<no1)
        {
            if(no2<no1)
            {
                temp=no2;
                no2=no1;
                no1=temp;
            }
            if(no3<no1)
            {
                temp=no3;
                no3=no1;
                no1=temp;
            }
        }

        if(no2>no3)
        {
            temp=no2;
            no2=no3;
            no3=temp;
        }
        System.out.println("com.clgPract.Ascending order="+no1+","+no2+","+no3);

    }

}