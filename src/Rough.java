//public class Rough{
//    public static void main(String[] args) {
//        int sum = 0;
//
//        for(int i=1;i<=5;i++)
//        {
//            sum += i;
//            System.out.println(i);
//        }
//        int average = sum / 5 ;
//        System.out.println("The average is :" + average);
//    }
//}




//interface Event {
//    public void start();
//}
//interface Sports {
//    public void play();
//}
//interface Hockey extends Sports, Event{
//    public void show();
//}
//public class Rough{
//    public static void main(String[] args){
//        Hockey hockey = new Hockey() {
//            public void start() {
//                System.out.println("Start Event");
//            }
//            public void play() {
//                System.out.println("Play Sports.");
//            }
//            public void show() {
//                System.out.println("Show Hockey.");
//            }
//        };
//
//        hockey.start();
//        hockey.play();
//        hockey.show();
//    }
//}









// Implementing Dynamic Method Dispatch

//class Apple
//{
//    void display()
//    {
//        System.out.println("Inside Apple's display method");
//    }
//}
//
//class Banana extends Apple
//{
//    void display()   // overriding display()
//    {
//        System.out.println("Inside Banana's display method");
//    }
//}
//
//class Cherry extends Apple
//{
//    void display()   // overriding display()
//    {
//        System.out.println("Inside Cherry's display method");
//    }
//}
//
//public class Rough
//{
//    public static void main(String args[])
//    {
//        Apple a  = new Apple();   // object of Apple
//        Banana b = new Banana();  // object of Banana
//        Cherry c = new Cherry();  // object of Cherry
//
//        Apple ref;    // taking a reference of Apple
//
//        ref = a;   // r refers to a object in Apple
//        ref.display();   // calling Apple's version of display()
//
//        ref = b;   // r refers to a object in Banana
//        ref.display();   // calling Banana's version of display()
//
//        ref = c;  // r refers to a object in Cherry
//        ref.display();  // calling Cherry's version of display()
//    }
//}


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

class Rough{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print_color();
    }
}