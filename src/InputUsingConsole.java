import java.io.Console;
public class InputUsingConsole {
    public static void main(String[] args) {
        String name = System.console().readLine();
        System.out.println("Enter you name: " + name);
    }
}
