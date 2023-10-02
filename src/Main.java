import java.io.*;

/**
 * Основной класс приложения для работы с данными и файлами CSV.
 */
public class Main {
    /**
     * Точка входа в приложение.
     *
     * @param args Аргументы командной строки (не используются в данном приложении).
     */
    public static void main(String[] args) {
        // Сохраняем данные в CSV файл
        MyWriter.saveInCsvFile(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123}, {300, 400, 500}});

        // Читаем данные из CSV файла
        AppData dataOne = MyReader.readCsvFile("file.csv");
        System.out.println("Данные из файла:");
        System.out.println(dataOne);

        // Создаем новый набор данных и сохраняем в CSV файл
        AppData dataTwo = new AppData(new String[]{"qwe", "qwe"}, new int[][]{{1, 2}, {3, 4}});
        MyWriter.saveInCsvFile(dataTwo);
        System.out.println("Новые данные записаны в файл.");

        // Читаем и выводим данные из CSV файла
        System.out.println("\nДанные из файла после записи новых данных:");
        AppData newData = MyReader.readCsvFile("file.csv");
        System.out.println(newData);
    }
}
