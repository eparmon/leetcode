package by.eparmon.leetcode.datastructures.array.problem1299;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    private final ReplaceElementsWithGreatestElementOnRightSide solution = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, solution.solve(new int[]{17, 18, 5, 4, 6, 1}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{-1}, solution.solve(new int[]{400}));
    }

}
