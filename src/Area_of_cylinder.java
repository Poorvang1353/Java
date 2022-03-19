import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;

    public void setRadius() {
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        this.radius = sc.nextInt();
    }
    public void setHeight() {
        System.out.println("Enter the height: ");
        Scanner sc = new Scanner(System.in);
        this.height = sc.nextInt();
    }

    public double surface(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public  double volume(){
        return  Math.PI * radius * radius * height;
    }
}
public class Area_of_cylinder {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setHeight();
        cy.setRadius();

        System.out.println("The volume of cylinder is: " + cy.volume());
        System.out.println("The surface of cylinder is: " + cy.surface());
    }
}
