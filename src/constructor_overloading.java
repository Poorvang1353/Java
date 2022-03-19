class detail{
    private int id;
    private String name;

    public detail(){                             //this is constructor
        id = 33;
        name = "Poorvang";
    }

    public detail(String myName, int myId){       //this is constructor overloading
        id = myId;
        name = myName;
    }

    public int getA() {
        return id;
    }

    public void setA(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        detail poorvang = new detail("POORVANG", 342);    //you can also run without giving name or id
        System.out.println("My name is: " + poorvang.getName());
        System.out.println("My Id is: " + poorvang.getA());
    }
}
