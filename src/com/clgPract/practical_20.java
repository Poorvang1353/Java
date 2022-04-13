package com.clgPract;

public class practical_20{
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        System.out.println("------This is odd number between 1 to 20------");
        for(int i=1;i<=20;i++){
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        System.out.println("------This is even number between 1 to 20------");
        for(int i=1;i<=20;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}


