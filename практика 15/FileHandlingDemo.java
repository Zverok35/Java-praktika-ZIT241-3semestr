// FileHandlingDemo.java
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileHandlingDemo {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        // Основной метод программы
        writeStudentData();
        readAndAnalyzeData();
    }

    /**
     * Метод для записи данных в файл
     */
    private static void writeStudentData() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            // Записываем тестовые данные
            writer.write("Иванов 85\n");
            writer.write("Петров 92\n");
            writer.write("Сидорова 78\n");
            writer.write("Козлов 95\n");
            writer.write("Михайлова 88\n");
            
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    /**
     * Метод для чтения и анализа данных
     */
    private static void readAndAnalyzeData() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
            
            System.out.println("\nСодержимое файла:");
            
            int maxScore = Integer.MIN_VALUE;
            String bestStudent = "Не найден";
            
            for (String line : lines) {
                System.out.println(line);
                
                // Разделяем строку на части
                String[] parts = line.trim().split(" ");
                
                if (parts.length == 2) {
                    try {
                        int score = Integer.parseInt(parts[1]);
                        
                        if (score > maxScore) {
                            maxScore = score;
                            bestStudent = parts[0];
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Ошибка преобразования числа в строке: " + line);
                    }
                } else {
                    System.err.println("Некорректный формат строки: " + line);
                }
            }
            
            System.out.println("\nЛучший студент: " + bestStudent + " (" + maxScore + " баллов)");
            
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
