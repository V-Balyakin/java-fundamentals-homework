import java.util.Scanner;

public class randomNumberOperations {
    public static void main(String[] args) {
        int sumOfEnteredNumbers = 0;
        int multiplicationOfEnteredNumbers = 1;
        Scanner quantityOfNumbersFromKeyboard = new Scanner(System.in);
        System.out.println("Сколько чисел вы желаете ввести?");
        int razmernostMassiva = quantityOfNumbersFromKeyboard.nextInt();
        int massivIzChisel[] = new int[razmernostMassiva];
        for (int i = 0; i < massivIzChisel.length; i++) {
            Scanner numberForArrayFromKeyboard = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + "-е число");
            massivIzChisel[i] = numberForArrayFromKeyboard.nextInt();
        }
        System.out.print("Ваши числа: ");
        for (int i = 0; i < massivIzChisel.length; i++)
            System.out.print(massivIzChisel[i] + " ");
        System.out.println("");
        for (int i = 0; i < massivIzChisel.length; i++) {
            sumOfEnteredNumbers += massivIzChisel[i];
        }
        System.out.println("Сумма введённых чисел равна: " + sumOfEnteredNumbers);
        for (int i = 0; i < massivIzChisel.length; i++) {
            multiplicationOfEnteredNumbers *= massivIzChisel[i];
        }
        System.out.println("Произведение введённых чисел равно: " + multiplicationOfEnteredNumbers);
    }
}
