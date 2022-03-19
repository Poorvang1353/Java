import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter number you want to print multiplication table: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",n,i,(n*i));
        }
    }
}