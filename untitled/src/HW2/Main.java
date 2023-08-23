package src.HW2;

import javax.swing.text.html.MinimalHTMLWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Main {
    /* Получить исходную json строку из файла, используя FileReader или Scanner
    Дана json строка вида:
    String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

    Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.

    Используйте StringBuilder для подготовки ответа. Далее создайте метод, который запишет
    результат работы в файл. Обработайте исключения и запишите ошибки в лог файл с помощью Logger.*/
    public static void main(String[] args) {
        String filePathRead = "D:\\Ekaterina\\GeekBrains\\Java\\untitled\\src\\HW2\\HW2Read.txt";
        String filePathWrite = "D:\\Ekaterina\\GeekBrains\\Java\\untitled\\src\\HW2\\HW2Write.txt";
        String jsonString = readInFile(filePathRead);
        String resultString = Parse(jsonString).toString();
        System.out.println(jsonString);
        System.out.println(resultString);

        writeToFile(resultString, filePathWrite);
    }
    static String readInFile(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
           while (scanner.hasNext()) {
               stringBuilder.append(scanner.nextLine());
               stringBuilder.append("\n");
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static void writeToFile(String s1, String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(s1);
 //           writer.write("\\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static StringBuilder Parse(String jsonString) {
        String step1 = jsonString.replace("{", "");
        String step2 = step1.replace("}", "");
        String step3 = step2.replace("[", "");
        String step4 = step3.replace("]", "");
        String step5 = step4.replace("\"", "");
        String step6 = step5.replace(" +\n", "");
        String step7 = step6.replace("'\'", "");
        String newString = step6;
        System.out.println(newString);
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrayData = newString.split(",");
 //       arrayData[arrayData.length] = arrayData[arrayData.length].substring(0, arrayData.length - 2);
        String[] words = {"\n Студент ", " получил ", " по предмету "};
        for (int j = 0; j < arrayData.length - 1; j++) {
                stringBuilder.append(words[j% words.length]);
                stringBuilder.append(arrayData[j].substring(arrayData[j].indexOf(':') + 2, arrayData[j].length() - 1));
            }
        stringBuilder.append(words[words.length - 1]);
        stringBuilder.append(arrayData[arrayData.length - 1].substring(arrayData[arrayData.length - 1].indexOf(':') + 2, arrayData[arrayData.length - 1].length() - 3));
        stringBuilder.append('.');

        return stringBuilder;
        }

    }

