package pro.sisit.alg.sorting;

import java.util.Map;
import java.util.function.Function;

public class Sort {


    public static Map<SortType, Function<int[], int[]>> map;
    public static int[] sort2(int[] array, SortType type) {
        return map.get(type).apply(array);
    }

}
