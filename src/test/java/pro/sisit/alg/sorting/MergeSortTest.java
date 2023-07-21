package pro.sisit.alg.sorting;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sisit.alg.sorting.MergeSort.mergeSorting;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    public void mergeSortASCTest() {
        assertArrayEquals(
            new int[]{1, 3, 5, 7, 8, 9, 12, 15},
            mergeSorting(new int[]{15, 3, 12, 5, 1, 8, 7, 9})
        );
    }

    @Test
    public void isNullMergeArray() {
        assertArrayEquals(
            new int[]{-1},
            mergeSorting(null)
        );
    }

}
