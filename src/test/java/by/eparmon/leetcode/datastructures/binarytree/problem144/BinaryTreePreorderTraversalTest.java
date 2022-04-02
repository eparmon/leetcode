package by.eparmon.leetcode.datastructures.binarytree.problem144;

import by.eparmon.leetcode.datastructures.binarytree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BinaryTreePreorderTraversalTest {

    private BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();

    @Test
    public void testRecursively1() {
        var root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Assertions.assertEquals(List.of(1, 2, 3), solution.solveRecursively(root));
    }

    @Test
    public void testRecursively2() {
        Assertions.assertEquals(List.of(), solution.solveRecursively(null));
    }

    @Test
    public void testRecursively3() {
        Assertions.assertEquals(List.of(1), solution.solveRecursively(new TreeNode(1)));
    }

    @Test
    public void testIteratively1() {
        var root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Assertions.assertEquals(List.of(1, 2, 3), solution.solveIteratively(root));
    }

    @Test
    public void testIteratively2() {
        Assertions.assertEquals(List.of(), solution.solveIteratively(null));
    }

    @Test
    public void testIteratively3() {
        Assertions.assertEquals(List.of(1), solution.solveIteratively(new TreeNode(1)));
    }

}
