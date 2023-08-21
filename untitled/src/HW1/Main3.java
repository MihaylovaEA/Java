package HW1;

import java.util.Scanner;

public class Main3 {
    /*
    Реализовать простой калькулятор
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите операцию (+, -, *, /): ");
        String operator = scanner.next();
        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();
        int res = 0;

        switch (operator){
            case "+":
                res = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + res);
                break;
            case "-":
                res = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + res);
                break;
            case "*":
                res = firstNum * secondNum;
                System.out.println(firstNum + " * " + secondNum + " = " + res);
                break;
            case "/":
                res = firstNum / secondNum;
                System.out.println(firstNum + " / " + secondNum + " = " + res);
                break;
            default:
                System.out.println("Введена некорректная арифметическая операция. Попробуйте еще раз.");
                break;
        }
    }
}
