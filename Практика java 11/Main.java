import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. Создаём ArrayList для хранения фруктов
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Добавляем 5 любимых фруктов
        fruits.add("банан");
        fruits.add("яблоко");
        fruits.add("киви");
        fruits.add("апельсин");
        fruits.add("груша");

        // 3. Выводим все элементы списка
        System.out.println("Исходный список фруктов: " + fruits);

        // 4. Удаляем третий элемент (индекс 2, так как нумерация начинается с 0)
        fruits.remove(2);
        System.out.println("Список после удаления третьего элемента: " + fruits);

        // 5. Проверяем, содержит ли список "яблоко"
        if (fruits.contains("яблоко")) {
            System.out.println("Список содержит 'яблоко'");
        } else {
            System.out.println("Список не содержит 'яблоко'");
        }

        // 6. Сортируем список по алфавиту
        Collections.sort(fruits);
        System.out.println("Отсортированный список фруктов: " + fruits);
    }
}
