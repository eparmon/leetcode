package by.eparmon.leetcode.datastructures.arrays.problem1089;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the
 * right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * <p>
 * Do the above modifications to the input array in place, do not return anything from your function.
 * <p>
 * <a href="https://leetcode.com/problems/duplicate-zeros/">Leetcode</a>
 */
public class DuplicateZeros {

    public void solve(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            res[i] = arr[j];
            if (res[i] == 0 && i < arr.length - 1) {
                res[++i] = 0;
            }
        }
        System.arraycopy(res, 0, arr, 0, arr.length);
    }


    public void solveWithStreams(int[] arr) {
        int[] res = Arrays.stream(arr)
                .flatMap(num -> {
                    if (num == 0) {
                        return IntStream.of(0, 0);
                    }
                    return IntStream.of(num);
                })
                .limit(arr.length)
                .toArray();
        System.arraycopy(res,0, arr, 0, arr.length);
    }

}
