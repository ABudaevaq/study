package pro.sisit.alg.sorting;

import java.util.Objects;

public class BubbleSort {

    public static boolean isSortedASC(int[] array) {
        if (Objects.isNull(array)) {
            return false;
        }

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] bubbleSort(int[] bubble) {
        int so;
        while (!isSortedASC(bubble)) {
            for (int i = 0; i < bubble.length - 1; i++) {
                if (bubble[i] > bubble[i + 1]) {
                    so = bubble[i];
                    bubble[i] = bubble[i + 1];
                    bubble[i + 1] = so;
                }
            }
        }
        return bubble;
    }


}
