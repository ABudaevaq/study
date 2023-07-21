package pro.sisit.alg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sisit.alg.BinaryQuest.binaryQuest;

class BinaryQuestTest {

    @Test
    public void binaryQuestTest() {
        int[] ar = {0, 2, 5, 8, 11, 16};
        assertEquals(2, binaryQuest(ar, 5));
    }

    @Test
    public void binaryQuestTestOneElement() {
        int[] ar = {8};
        assertEquals(0, binaryQuest(ar, 8));
    }

    @Test
    public void binaryQuestTestNotFound() {
        int[] ar = {0, 2, 5, 8, 11, 16};
        assertEquals(-1, binaryQuest(ar, 15));
    }

    @Test
    public void binaryQuestTestIncorrectData() {
        assertEquals(-1, binaryQuest(null, 15));
    }

    @Test
    public void binaryQuestTestNotSortedData() {
        // TODO: доработать тест, чтобы он ожидал исключение
        int[] ar = {16, 11, 8, 5, 2, 1, 0};
        assertEquals(5, binaryQuest(ar, 1));
    }

}
