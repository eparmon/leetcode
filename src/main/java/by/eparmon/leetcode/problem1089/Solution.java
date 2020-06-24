package by.eparmon.leetcode.problem1089;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of
 * zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return
 * anything from your function.
 *
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class Solution {

    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            res[i] = arr[j];
            if (res[i] == 0 && i < arr.length - 1) {
                res[++i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }
    }

}
