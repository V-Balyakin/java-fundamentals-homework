import java.util.Scanner;

public class reverseCommandLineArguments {
    public static void main(String[] args) {
        Scanner dataFromKeyboard = new Scanner(System.in);
        System.out.println("Какое КОЛИЧЕСТВО чисел (от 1 до 10) желаете ввести?");
        int numbersOfVariablesFromKeyboard = dataFromKeyboard.nextInt();
        int massivIzChisel[] = new int[numbersOfVariablesFromKeyboard];
        for (int i = 1; i <= numbersOfVariablesFromKeyboard; i++) {

            System.out.println("Введите " + i + "-е число");
            Scanner numberFromKeyboardForMassiv = new Scanner(System.in);
            int chisloDlyaMassiva = numberFromKeyboardForMassiv.nextInt();

            massivIzChisel[i - 1] = chisloDlyaMassiva;
        }
        System.out.println("Полученный массив:");
        for (int i = 0; i <= numbersOfVariablesFromKeyboard-1; i++) {
            System.out.print(massivIzChisel[i] + " ");
        }
        System.out.println("");
        System.out.println("Ваш массив в обратном порядке:");
        for (int i = numbersOfVariablesFromKeyboard-1; i >= 0; i--) {
            System.out.print(massivIzChisel[i] + " ");
        }
    }
}
