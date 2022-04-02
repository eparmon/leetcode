package by.eparmon.leetcode.datastructures.binarytree.problem144;

import by.eparmon.leetcode.datastructures.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/">Leetcode</a>
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> solveRecursively(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        if (root.left != null) {
            list.addAll(solveRecursively(root.left));
        }
        if (root.right != null) {
            list.addAll(solveRecursively(root.right));
        }
        return list;
    }


    public List<Integer> solveIteratively(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        var node = root;
        while (true) {
            list.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                node = node.left;
            } else if (!stack.empty()) {
                node = stack.pop();
            } else {
                return list;
            }
        }
    }

    // 1. put root
    // if left != null
    // 2a. put right to queue (stack?), make left root
    // else
    // 2b. pop root from stack
    // end when stack is empty

}
