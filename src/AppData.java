import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Класс представляет данные приложения, включая заголовки и двумерный массив данных.
 */
public class AppData {
    private String[] header; // Массив заголовков
    private int[][] data;    // Двумерный массив данных

    /**
     * Конструктор по умолчанию, создает пустой объект AppData.
     */
    public AppData() {
    }

    /**
     * Конструктор, инициализирует объект AppData заданными заголовками и данными.
     *
     * @param header Массив строк, представляющий заголовки данных.
     * @param data   Двумерный массив целых чисел, представляющий собой данные.
     */
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    /**
     * Возвращает строковое представление объекта AppData в виде форматированной таблицы.
     *
     * @return Строковое представление данных в формате таблицы.
     */
    @Override
    public String toString() {
        StringBuilder stringDate = new StringBuilder();
        for (String word : header) {
            stringDate.append(word).append("\t");
        }
        stringDate.append("\n");
        for (int[] row : data) {
            for (int value : row) {
                stringDate.append(value).append("\t");
            }
            stringDate.append("\n");
        }
        return stringDate.toString();
    }

    /**
     * Возвращает массив заголовков данных.
     *
     * @return Массив строк с заголовками данных.
     */
    public String[] getHeader() {
        return header;
    }

    /**
     * Возвращает двумерный массив данных.
     *
     * @return Двумерный массив целых чисел, представляющий собой данные.
     */
    public int[][] getData() {
        return data;
    }
}
