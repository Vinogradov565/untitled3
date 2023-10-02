import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Класс для чтения данных из CSV файла и преобразования их в объект AppData.
 */
abstract public class MyReader {

    /**
     * Читает данные из CSV файла и возвращает объект AppData, содержащий эти данные.
     *
     * @param pathFile Путь к CSV файлу.
     * @return Объект AppData, содержащий данные из CSV файла.
     */
    public static AppData readCsvFile(String pathFile) {
        ArrayList<String[]> stringData = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringData.add(line.split(";"));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return new AppData(stringData.get(0), getDataInt(stringData));
    }

    /**
     * Преобразует ArrayList строк данных из CSV файла в двумерный массив целых чисел.
     *
     * @param stringData ArrayList строк данных из CSV файла.
     * @return Двумерный массив целых чисел, представляющий данные.
     */
    private static int[][] getDataInt(ArrayList<String[]> stringData) {
        stringData.remove(0);
        int[][] data = new int[stringData.size()][stringData.get(0).length];

        for (int row = 0; row < stringData.size(); row++) {
            for (int column = 0; column < stringData.get(0).length; column++) {
                data[row][column] = Integer.parseInt(stringData.get(row)[column]);
            }
        }
        return data;
    }
}
