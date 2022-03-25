package by.eparmon.leetcode.datastructures.arrays.problem1299;

/**
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 * <p>
 * After doing so, return the array.
 * <p>
 * <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">Leetcode</a>
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] solve(int[] arr) {
        int max = -1;
        int tmp;
        for (int i = arr.length - 1; i >= 0; i--) {
            tmp = arr[i];
            arr[i] = max;
            if (tmp > max) {
                max = tmp;
            }
        }
        return arr;
    }

}
