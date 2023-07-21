package pro.sisit.alg.sorting;

import java.util.Objects;

public class QuickSort {

    public static int[] quickSort(int[] array, int left, int right) {

        if (Objects.isNull(array)) {
            return new int[]{-1};
        }

        int i = left;
        int j = right;
        int oporn;

        oporn = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < oporn) {
                i++;
            }
            while (oporn < array[j]) {
                j--;
            }
            if (i <= j) {
                int  buff = array[i];
                array[i] = array[j];
                array[j] = buff;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }
        if (i < right) {
            quickSort(array, i, right);
        }
        return array;
    }

}
