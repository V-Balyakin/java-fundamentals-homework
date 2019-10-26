import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner nameFromKeyboard = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String userName = nameFromKeyboard.next();
        System.out.println("Привет, " + userName + "!");
    }
}
