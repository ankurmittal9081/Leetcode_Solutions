// Last updated: 9/16/2025, 9:33:58 AM
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
    public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> l=new ArrayList<>();
        trev(root,l);
        return l;
        
    }
    public void trev(TreeNode n,ArrayList<Integer> l){
            if(n==null){
                return ;
            }
            trev(n.left,l);
            trev(n.right,l);
            l.add(n.val); 
        }
}