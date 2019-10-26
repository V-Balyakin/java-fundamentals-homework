import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        int sumOfEnteredNumbers = 0;
        int multiplicationOfEnteredNumbers = 1;
        Scanner quantityOfNumbersFromKeyboard = new Scanner(System.in);
        System.out.println("Сколько чисел вы желаете ввести?");
        int arrayDimension = quantityOfNumbersFromKeyboard.nextInt();
        int arrayOfNumbers[] = new int[arrayDimension];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Scanner numberForArrayFromKeyboard = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + "-е число");
            arrayOfNumbers[i] = numberForArrayFromKeyboard.nextInt();
        }
        System.out.print("Ваши числа: ");
        for (int i = 0; i < arrayOfNumbers.length; i++)
            System.out.print(arrayOfNumbers[i] + " ");
        System.out.println("");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sumOfEnteredNumbers += arrayOfNumbers[i];
        }
        System.out.println("Сумма введённых чисел равна: " + sumOfEnteredNumbers);
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            multiplicationOfEnteredNumbers *= arrayOfNumbers[i];
        }
        System.out.println("Произведение введённых чисел равно: " + multiplicationOfEnteredNumbers);
    }
}
