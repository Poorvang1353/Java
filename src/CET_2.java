//abstract class Employee{
//    int id;
//    int salary;
//    String name;
//
//    public Employee(String name, int payPerHour) {
//    }
//
//    public Employee() {
//
//    }
//
//    public void printDetails(){
//        System.out.println("My ID is: "+ id);
//        System.out.println("My name is " + name);
//        System.out.println("My salary is " + salary);
//    }
//
//    public abstract int calculateSalary();
//}
//
//public class Own_java_class {
//    public static void main(String[] args) {
//        Employee poorvang = new Employee() {
//            @Override
//            public int calculateSalary() {
//                return 0;
//            }
//        };
//        poorvang.id = 1932;
//        poorvang.name = "Poorvang";
//        poorvang.salary = 342323;
//
//        poorvang.printDetails();
//    }
//}
import java.util.Scanner;
abstract class Employee {
    private String name;
    private int payPerHour;
    public Employee(String name, int payPerHour) {
        this.name = name;
        this.payPerHour = payPerHour;
    }
    public abstract int calculateSalary();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPayPerHour() {
        return payPerHour;
    }
    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }
}
class Manager extends Employee {
    private final byte workHours;
    public Manager(String name, int payPerHour, int workHours) {
        super(name, payPerHour);
        this.workHours = (byte) workHours;
    }
    @Override
    public int calculateSalary() {
        return getPayPerHour() * (byte) workHours * 365;
    }
}
class Clerk extends Employee {
    public Clerk(String name2, int payPerHour) {
        super(name2, payPerHour);
    }
    @Override
    public int calculateSalary() {
        return getPayPerHour() * 8 * 365;
    }
}
public class CET_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of hours that manager and clerk will work: ");
        byte workHours = obj.nextByte();
        System.out.print("Enter the name of Manager: ");
        String name1 = obj.next();
        System.out.print("Enter the amount that manager will get paid per hour: ");
        int payPerHour1 = obj.nextInt();
        System.out.print("Enter the name of Clerk: ");
        String name2 = obj.next();
        System.out.print("Enter the amount that clerk will get paid per hour: ");
        int payPerHour2 = obj.nextInt();
        Employee Manager = new Manager(name1, payPerHour1, workHours);
        Employee Clerk = new Clerk(name2, payPerHour2);
        System.out.println("The net salary of a manager is: Rs." + Manager.calculateSalary());
        System.out.println("The net salary of a clerk is: Rs." + Clerk.calculateSalary());
    }
}
