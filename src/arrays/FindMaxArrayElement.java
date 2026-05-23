package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxArrayElement {
    public int[] findMaxAndMinValue(int[] array) {
        int min = array[0], max = array[0];
        for (int value : array) {
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }
        return new int[]{min, max};

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMaxArrayElement element = new FindMaxArrayElement();
        int[] array = {1, 2, 3, 4, 5, -10, -12};
        int[] array2 = new int[5];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        array2[0] = 12;
        array2[1] = 10;

        System.out.println(Arrays.toString(array2));

//        System.out.println(Arrays.toString(element.findMaxAndMinValue(array)));
    }

}
