import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        int year = 0;
        System.out.println("Enter year for checking leap year or not: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year%4==0){
            System.out.println(year + " is leap year");
        }
        else
            System.out.println(year + " is not leap year");
    }
}
