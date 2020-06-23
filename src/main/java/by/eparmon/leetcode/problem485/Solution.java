package by.eparmon.leetcode.problem485;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array. 
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] numbers) {
        int maxRowLength = 0;
        int currentRowLength = 0;
        for (int number : numbers) {
            if (number == 1) {
                currentRowLength++;
            } else {
                maxRowLength = Math.max(maxRowLength, currentRowLength);
                currentRowLength = 0;
            }
        }
        return Math.max(maxRowLength, currentRowLength);
    }

}
