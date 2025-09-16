// Last updated: 9/16/2025, 9:34:09 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                TreeNode n = q.poll();
                level.add(n.val);

                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }
            result.add(level);
            leftToRight = !leftToRight; // flip direction
        }

        return result;
    }
}
