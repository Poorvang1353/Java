class details{
    private int a;
    private String name;

    public details() {        //This is our constructor
        a = 34;
        name = "POORVANG";
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class constructor {
    public static void main(String[] args) {
        details poorvang = new details();
        System.out.println(poorvang.getA());
        System.out.println(poorvang.getName());
    }
}
