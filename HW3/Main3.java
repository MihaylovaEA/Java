package src.HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main3 {
    /*��������� ������ ���������� ������ ��������� ������� � ������������ ������� � ������������. ������� �������� ������ ������� � ���������� ��� ���������� � ������.
    Collections.frequency(list, item)
     */

    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        System.out.println("�������� ������ ����� �����: " + ArrayList);

        System.out.println("�����������: " + (Collections.frequency(list, 2));
        System.out.println("������������: " + Collections.max(ArrayList));
        System.out.println("������� ��������������: " + listAvg(ArrayList));
    }

    public static List<Integer> planetsList(int size) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(upperBound - lowerBound) + lowerBound);
        }
        return result;
    }