import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner numbersFromKeyboard = new Scanner(System.in);
        System.out.println("Сколько чисел вы желаете сгенерировать?");
        int arrayDimension = numbersFromKeyboard.nextInt();
        int arrayForPrinting[] = new int[arrayDimension];
        System.out.println("Генерация массива...");
        System.out.println("Печать чисел массива в одной строке...");
        for (int i = 0; i < arrayForPrinting.length; i++) {
            arrayForPrinting[i] = (int) (Math.random() * 100 / 2);
            System.out.print(arrayForPrinting[i] + " ");
        }
        System.out.println("");
        System.out.println("Печать чисел массива c переходом на новую строку...");
        for (int i = 0; i < arrayForPrinting.length; i++) {
            System.out.println(arrayForPrinting[i]);
        }
    }
}
