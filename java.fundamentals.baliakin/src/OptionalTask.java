import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {
        Scanner quantityOfNumbersFromUser = new Scanner(System.in);
        System.out.println("Сколько чисел вы желаете ввести?");
        int arrayDimension = quantityOfNumbersFromUser.nextInt();
        String arrayOfNumbers[] = new String[arrayDimension];
        String arrayWithLongestNumber [] = new String [1];
        String arrayWithShortestNumber [] = new String [1];
        int lengthOfAllNumbers = 0;
        int averageLengthOfNumbers = 0;

        // Создаём массив чисел
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Scanner numberForArrayFromKeyboard = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + "-е число");
            arrayOfNumbers[i] = numberForArrayFromKeyboard.next();
        }

        // Печатаем полученные числа одним массивом
        System.out.print("Ваши числа: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
        System.out.println("");
        // System.out.println("Тест: Длина 3-го элемента массива чисел равна: " + arrayOfNumbers[2].length());

        // Находим самое короткое  число среди имеющихся
        int initialElement = arrayOfNumbers[0].length();
        arrayWithShortestNumber[0] = arrayOfNumbers[0];
        for (int i = 1; i <= arrayOfNumbers.length-1; i++) {
            int currentNumber = arrayOfNumbers[i].length();
                if (currentNumber < initialElement) {
                arrayWithShortestNumber[0] = arrayOfNumbers[i];
                }
        }

        System.out.println("");
        System.out.println("Самое короткое число: " + arrayWithShortestNumber[0]);
        System.out.println("Его длина равна: " + arrayWithShortestNumber[0].length());
        System.out.println("");

        // Находим самое длинное число среди имеющихся
        initialElement = arrayOfNumbers[0].length();
        arrayWithLongestNumber[0] = arrayOfNumbers[0];
        for (int i = 1; i <= arrayOfNumbers.length-1; i++) {
            int currentNumber = arrayOfNumbers[i].length();
            if (currentNumber > initialElement) {
                arrayWithLongestNumber[0] = arrayOfNumbers[i];
            }
        }
        System.out.println("Самое длинное число: " + arrayWithLongestNumber[0]);
        System.out.println("Его длина равна: " + arrayWithLongestNumber[0].length());
        System.out.println("");

        // Находим среднюю длину чисел в массиве
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            lengthOfAllNumbers += arrayOfNumbers[i].length();
        }
        System.out.println("Суммарная длина всех чисел равна: " + lengthOfAllNumbers);
        averageLengthOfNumbers = lengthOfAllNumbers/arrayDimension;
        System.out.println("Средняя длина числа равна: " + averageLengthOfNumbers);
        System.out.println("");

        // Находим числа, длина которых меньше средней длины чисел в массиве
        System.out.println("Числа, длина которых меньше средней длины по массиву чисел: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i].length() < averageLengthOfNumbers) {
                System.out.print(arrayOfNumbers[i] + ", его длина " + arrayOfNumbers[i].length());
                System.out.println();
            }
        }
        System.out.println("");

        // Находим числа, длина которых больше средней длины чисел в массиве
        System.out.println("Числа, длина которых больше средней длины по массиву чисел: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i].length() > averageLengthOfNumbers) {
                System.out.print(arrayOfNumbers[i] + ", его длина " + arrayOfNumbers[i].length());
                System.out.println();
            }
        }
        System.out.println("");


    }
}
