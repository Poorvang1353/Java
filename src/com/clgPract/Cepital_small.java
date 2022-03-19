package com.clgPract;

import java.util.Scanner;
class Cepital_small
{
    public static void main(String a[])
    {
        Scanner in=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter String: ");
        s=in.nextLine();
        char c;
        int ct=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>=97 && c<=122)
            {
                ct++;
            }
        }
        System.out.println("Total no. of words start with small letter is: "+ct);
    }

}
