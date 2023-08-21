package HW1;

import java.util.Scanner;

public class Main1 {
    /*
    1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        System.out.println("Триугольное число n:" + triangle(n));
        System.out.println("Факториал n:" + factorial(n));
    }

    static int triangle (int n) {
        int t = 0;
        for (int i = 1; i < n + 1; i++) {
            t = t + i;
        }
        return t;
    }

    static int factorial(int n) {
        int s = 1;
        for (int i = 1; i < n + 1; i++) {
            s = s * i;
        }
        return s;
    }


}
