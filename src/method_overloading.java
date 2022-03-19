public class method_overloading {
    static void number(){
        System.out.println("My number is nothing");
    }

    static void number(int a){
        System.out.println("My number is: " + a);
    }

    static void  number(int a, int b){
        System.out.println("My number is: " + a);
        System.out.println("My number second number is: " + b);
    }

    public static void main(String[] args) {
        number();
        number(323);
        number(34,54);
    }
}
