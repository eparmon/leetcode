package by.eparmon.leetcode.problem88;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        int[] array1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] array2 = new int[]{2, 5, 6};
        solution.merge(array1, 3, array2, 3);
        Assertions.assertArrayEquals(new int[]{1,2,2,3,5,6}, array1);
    }

}
