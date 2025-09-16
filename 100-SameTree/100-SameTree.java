// Last updated: 9/16/2025, 9:34:14 AM
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
class Solution 
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p==null && q==null){
            return true;
        }

        if(p==null||q==null){
            return false;
        }
    //     return ischeck(p,q);
        
    // }
    // public boolean ischeck(TreeNode p, TreeNode q){
    //     if(p.left!=q.left){
    //         return false;
    //     }
    //     if(p.right!=q.right){
    //         return false;
    //     }
    //     return tru

    

    boolean left=isSameTree(p.left,q.left);
    boolean right=isSameTree(p.right,q.right);
    return p.val==q.val &&  left==true &&right==true;
    }
}