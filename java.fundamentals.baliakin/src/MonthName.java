import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        String [] monthNames = {"Запасная ячейка", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Scanner numberOfMonthFromUser = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int numberOfMonthForSystem = numberOfMonthFromUser.nextInt();
        if (numberOfMonthForSystem <= 0 || numberOfMonthForSystem > 12) {
            System.out.println("Извините, но месяца с таким номером не существует. Пожалуйста, введите корректный номер месяца");
        } else {
            System.out.println("Номер месяца, соответствующий введёному числу: " + monthNames[numberOfMonthForSystem]);
        }
    }
}
