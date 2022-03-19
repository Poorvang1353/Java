class Students{
    int id;
    String name;
    public void studentDetails(){
        System.out.println("My name is: " + name);
        System.out.println("and My ID is: " + id);
    }
}

public class custom_class {
    public static void main(String[] args) {
        Students poorvang = new Students();
        Students riddhi = new Students();
        poorvang.id = 2001030421;
        riddhi.id = 342342342;
         poorvang.name = "POORVANG";
         riddhi.name = "RIDDHI";

         poorvang.studentDetails();
         riddhi.studentDetails();
    }
}
