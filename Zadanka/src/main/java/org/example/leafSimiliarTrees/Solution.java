package org.example.leafSimiliarTrees;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        getLeafValues(root1, leaves1);
        getLeafValues(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private void getLeafValues(TreeNode root, List<Integer> leaves) {
        if (root != null) {
            if (root.left == null && root.right == null) { // Leaf node
                leaves.add(root.val);
            }
            getLeafValues(root.left, leaves);
            getLeafValues(root.right, leaves);
        }
    }
}
