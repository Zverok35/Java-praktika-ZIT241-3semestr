import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаём объект Scanner для ввода данных

        System.out.print("Введите число: ");  // Просим пользователя ввести число

        try {
            int number = scanner.nextInt();  // Пытаемся считать целое число
            int result = 100 / number;       // Пытаемся разделить 100 на введённое число

            System.out.println("Результат деления: " + result);  // Выводим результат, если ошибок нет
        } catch (InputMismatchException e) {  // Обрабатываем ошибку, если введено не число
            System.out.println("Ошибка: Введённый текст не является числом!");
        } catch (ArithmeticException e) {     // Обрабатываем ошибку деления на ноль
            System.out.println("Ошибка: Деление на ноль невозможно!");
        } finally {                          // Блок finally выполняется всегда, независимо от ошибок
            scanner.close();                 // Закрываем сканер
            System.out.println("Сканер закрыт.");
        }
    }
}
