// Last updated: 9/16/2025, 9:34:12 AM
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode p,TreeNode q){      
        if(p==null && q==null){
            return true;
        }  
        if(p==null || q==null){
            return  false;
        }

        return p.val==q.val && isMirror(p.left,q.right)&&isMirror(p.right,q.left);

    }

    // TreeNode node = root;
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(root.left);
    //     queue.add(root.right);
    //     while(!queue.isEmpty()){
    //         TreeNode left = queue.poll();
    //         TreeNode right = queue.poll();

    //         if(left == null && right == null){
    //             continue;
    //         }
    //         if(left == null || right == null){
    //             return false;
    //         }
    //         if(left.val != right.val){
    //             return false;
    //         }
    //         queue.add(left.left);
    //         queue.add(right.right);
    //         queue.add(left.right);
    //         queue.add(right.left);
    //     }
    //     return true;
}
