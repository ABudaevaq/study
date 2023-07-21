package pro.sisit.alg.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    public void sort() {
        assertArrayEquals(
            new int[]{0, 1, 3, 4, 5, 7, 8, 9},
            QuickSort.quickSort(new int[]{7, 0, 1, 9, 4, 8, 5, 3}, 0, 7)
        );
    }

    @Test
    public void isNullArray() {
        assertArrayEquals(
            new int[]{-1},
            QuickSort.quickSort(new int[]{}, 0, 0)
        );
    }


}
