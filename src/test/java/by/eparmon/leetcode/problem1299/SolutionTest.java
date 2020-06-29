package by.eparmon.leetcode.problem1299;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1},
                solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
    }

}
