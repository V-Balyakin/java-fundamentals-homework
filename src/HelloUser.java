import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter *user name*");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
