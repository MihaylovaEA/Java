package src.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    /*Пусть дан произвольный список целых чисел, удалить из него четные числа*/
    public static void main(String[] args) {
        List<Integer> integerList = intsInRange(10, 0, 10);
        System.out.println("Исходный список целых чисел: " + integerList);
        removeEven(integerList);
        System.out.println("Исходный список после удаления четных чисел: " + integerList);
    }

    public static List<Integer> intsInRange(int size, int lowerBound, int upperBound) {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
        }
        return result;
    }

    static void removeEven (List list){
        for (int i = 0; i < list.size(); i++) {
            if ((int)list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }

}
