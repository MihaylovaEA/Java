package src.L3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
     */
    public static void main(String[] args) {
        int a = 5;
        List<Integer> list = new ArrayList<>();
        int[] arr = {1,2,3};
        test(a, arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));

        String s = "4";
        System.out.println(s.equals('4'));

        Integer c = 4;
        Float f = 4f;
        System.out.println(c.equals(f));
    }

    static void test(int a, int[] arr){
        a++;
        arr[0] = 5;
    }
}