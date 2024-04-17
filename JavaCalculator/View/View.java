package View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(Double result, String title) {
        System.out.println(result);

    }

    public int getChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("\t1. Сумма");
        System.out.println("\t2. Умножение");
        System.out.println("\t3. Деление");
        return in.nextInt();
    }

}
