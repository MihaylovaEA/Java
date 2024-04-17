package Lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {
    /*Ќапишите метод, который составит строку, состо€щую из 100 повторений слова TEST
    и метод, который запишет эту строку в простой текстовый файл, обработайте исключени€
     */
    public static void main(String[] args) {
        int n = 100;
        String s = "Boom";
        String s1 = duplicate(s, n);
        String filePath = "test.txt";
        writeToFile(s1, filePath);
        System.out.println(readInFile(filePath));

    }

    static String readInFile(String filePath) {
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
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
            writer.write("\\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static String duplicate(String s, int n) {
        return s.repeat(n);
    }

}
