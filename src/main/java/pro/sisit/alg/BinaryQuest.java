package pro.sisit.alg;

import java.util.Arrays;
import java.util.Objects;
import org.w3c.dom.events.EventException;

public class BinaryQuest {

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

    public static int binaryQuest(int[] array, int value) {
        if (Objects.isNull(array)) {
            return -1;
        }

        // TODO: проверить что массив отсортирован и выбросить исключение если нет
        // array = Arrays.stream(array).sorted().toArray();

        try {
            if (!isSortedASC(array)) {
            }
            int index = -1;
            int down = 0;
            int up = array.length - 1;

            while (down <= up) {
                int medium = down + (up - down) / 2;
                if (array[medium] < value) {
                    down = medium + 1;
                } else if (array[medium] > value) {
                    up = medium - 1;
                } else if (array[medium] == value) {
                    index = medium;
                    break;
                }
            }

            return index;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Array not sorted.");
        }
        return -1;
    }

}
