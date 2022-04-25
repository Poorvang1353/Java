package com.clgPract;

/*Create a class called Student. Write a student manager program to manipulate the student
information from files by using FileInputStream and FileOutputStream*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class practical_21{

    public static void main(String[] args) {
        System.out.println("-------Writing Data in File-------");
        try {
            FileOutputStream fout = new FileOutputStream("stdinfo.txt");
            String str = "Name : Poorvang, Stream : Computer Engineering, Sem : 4th Sem";
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("successful write.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("-------Retrive Data From File-------");
        try {
            FileInputStream fin = new FileInputStream("stdinfo.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
