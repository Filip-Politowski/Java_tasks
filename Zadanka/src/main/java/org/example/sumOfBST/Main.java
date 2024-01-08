package org.example.sumOfBST;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        Solution solution = new Solution();
        int result = solution.rangeSumBST(root, 7, 15);
        System.out.println("Sum of values in the range [7, 15]: " + result);
    }

}

