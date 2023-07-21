package pro.sisit.alg;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pro.sisit.alg.sorting.BubbleSort.bubbleSort;
import static pro.sisit.alg.sorting.BubbleSort.isSortedASC;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    public void isNotSortedASCTest() {
        assertFalse(
            isSortedASC(new int[]{15, 3, 12, 5, 1, 8, 7, 9}));
    }

    @Test
    public void isSortedASCTest() {
        assertTrue(
            isSortedASC(new int[]{1, 3, 5, 7, 8, 9, 12, 15}));
    }


    @Test
    public void sort() {
        assertArrayEquals(
            new int[]{1, 3, 5, 7, 8, 9, 12, 15},
            bubbleSort(new int[]{15, 3, 12, 5, 1, 8, 7, 9})
        );
    }

}
