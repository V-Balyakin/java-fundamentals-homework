import java.util.Scanner;

public class printRandomMassiv {
    public static void main(String[] args) {
        Scanner numbersFromKeyboard = new Scanner(System.in);
        System.out.println("Сколько чисел вы желаете сгенерировать?");
        int razmernostMassiva = numbersFromKeyboard.nextInt();
        int massivDlyaPechati[] = new int[razmernostMassiva];
        System.out.println("Генерация массива...");
        System.out.println("Печать чисел массива в одной строке...");
        for (int i = 0; i < massivDlyaPechati.length; i++) {
            massivDlyaPechati[i] = (int) (Math.random() * 100 / 2);
            System.out.print(massivDlyaPechati[i] + " ");
        }
        System.out.println("");
        System.out.println("Печать чисел массива c переходом на новую строку...");
        for (int i = 0; i < massivDlyaPechati.length; i++) {
            System.out.println(massivDlyaPechati[i]);
        }
    }
}
