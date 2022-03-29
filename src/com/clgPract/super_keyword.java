package com.clgPract;
class Animal{
    String color = "white";
}
class Dog extends Animal {
    String color = "black";

    void print_color() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print_color();
    }
}


