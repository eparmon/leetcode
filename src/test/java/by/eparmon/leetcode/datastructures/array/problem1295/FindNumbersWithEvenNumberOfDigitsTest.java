package by.eparmon.leetcode.datastructures.array.problem1295;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {

    private final FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();

    @Test
    public void test1() {
        Assertions.assertEquals(2,
                solution.solve(new int[]{12, 345, 2, 6, 7896}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1,
                solution.solve(new int[]{555, 901, 482, 1771}));
    }

    @Test
    public void testWithStreams1() {
        Assertions.assertEquals(2,
                solution.solveWithStreams(new int[]{12, 345, 2, 6, 7896}));
    }

    @Test
    public void testWithStreams2() {
        Assertions.assertEquals(1,
                solution.solveWithStreams(new int[]{555, 901, 482, 1771}));
    }

}
