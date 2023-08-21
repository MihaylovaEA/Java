package HW1;

import java.util.Arrays;

public class Main2 {
    /*
    2) Вывести все простые числа от 1 до 1000
     */
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        System.out.println("Простые числа от 1 до n: ");

        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < i + 1; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
