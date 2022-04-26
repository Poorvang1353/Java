package com.clgPract;

/*Write an interactive program to print a string entered in a pyramid form. For instance, the string
“stream” has to be displayed as follows: */

public class practical_9{
    public static void main(String[] args) {
        int i, j, k;
        String str = "Stream";

        for (i = 0; i < str.length(); i++) {

            for (j = (str.length() / 2) + 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(str.charAt(k) + " ");
            }

            System.out.println();
        }
    }
}