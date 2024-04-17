package src.HW3;

import java.util.*;

public class Main2 {
    /*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()*/

    public static void main(String[] args) {
        List<Integer> ArrayList = intsInRange(5, 0, 10);
        System.out.println("Исходный список целых чисел: " + ArrayList);

        System.out.println("Минимальное: " + Collections.min(ArrayList));
        System.out.println("Максимальное: " + Collections.max(ArrayList));
        System.out.println("Среднее арифметическое: " + listAvg(ArrayList));
    }

    public static List<Integer> intsInRange(int size, int lowerBound, int upperBound) {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
        }
        return result;
    }

    static int listAvg (List list){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + (int)list.get(i);
            }
        return sum / list.size();
        }
    }

