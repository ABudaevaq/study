package pro.sisit.alg.sorting;

import java.util.Arrays;
import java.util.Objects;

public class MergeSort {

    public static int[] mergeSorting(int[] array) {
        if (Objects.isNull(array)) {
            return new int[]{-1};
        }
        if (array.length <= 1) {
            return array;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, left.length, array.length);
        return merge(mergeSorting(left), mergeSorting(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int resultIn = 0;
        int leftIn = 0;
        int rightIn = 0;

        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length) {
            if (left[leftIn] < right[rightIn]) {
                result[resultIn++] = left[leftIn++];
            } else {
                result[resultIn++] = right[rightIn++];
            }
        }

        while (resultIn < result.length) {
            if (leftIn != left.length) {
                result[resultIn++] = left[leftIn++];
            } else {
                result[resultIn++] = right[rightIn++];
            }
        }

        return result;
    }

}
