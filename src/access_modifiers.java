class MyEmployee {
    private int a;
    private String name;

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

public class access_modifiers{
    public static void main(String[] args) {
        MyEmployee poorvang = new MyEmployee();
        poorvang.setA(232);
        System.out.println("MY id is: " + poorvang.getA());
        poorvang.setName("POORVANG");
        System.out.println("My name is: " + poorvang.getName());
    }
}
